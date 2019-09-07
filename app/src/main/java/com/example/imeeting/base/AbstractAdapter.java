package com.example.imeeting.base;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseViewHolder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

/**
 * description:
 * created by wangbin on 2019/4/25
 */
public abstract class AbstractAdapter<T extends RecyclerView.ViewHolder, V> extends RecyclerView.Adapter<T> implements View.OnLongClickListener, View.OnClickListener {


    public List<V> getDatas() {
        return datas;
    }
    public OnItemChildClickListener childClickListener;
    @Override
    public void onClick(View v) {
        if (listener != null) {
            listener.clickItem(v, (int) v.getTag());
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (listener != null) {
            listener.clickLong(v, (int) v.getTag());
        }
        return true;
    }

    public void setChildClickListener(OnItemChildClickListener childClickListener){
        this.childClickListener = childClickListener;
    }



    public void setItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    protected OnItemClickListener listener;
    protected List<V> datas;
    private static final int TYPE_OF_FOOTER = 10000000;
    private static final int TYPE_OF_HEADER = 20000000;
    private SparseArray<View> mHeaderViews = new SparseArray<>();
    private SparseArray<View> mFooterViews = new SparseArray<>();

    public void setDatas(List<V> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    /**
     * 替换指定的位置的数据
     * @param index
     * @param data
     */
    public void setData(@IntRange(from = 0) int index, @NonNull V data) {
        datas.set(index, data);
        notifyItemChanged(index + (mHeaderViews== null ? 0: mHeaderViews.size()));
    }


    public void replaceData(List<V> data) {
        if (datas != null) {
            datas.clear();
            this.datas = data;
            notifyDataSetChanged();
        } else {
            setDatas(data);
        }
    }

    public AbstractAdapter() {
        super();
    }

    /**
     * add one new data in to certain location
     *
     * @param position
     */
    public void addData(@IntRange(from = 0) int position, @NonNull V data) {
        datas.add(position, data);
        notifyItemInserted(position + mHeaderViews.size());
        compatibilityDataSizeChanged(1);
    }

    /**
     * compatible getLoadMoreViewCount and getEmptyViewCount may change
     *
     * @param size Need compatible data size
     */
    private void compatibilityDataSizeChanged(int size) {
        final int dataSize = datas == null ? 0 : datas.size();
        if (dataSize == size) {
            notifyDataSetChanged();
        }
    }

    /**
     * add new data to the end of mData
     *
     * @param newData the new data collection
     */
    public void addDatas(@NonNull Collection<? extends V> newData) {
        datas.addAll(newData);
        notifyItemRangeInserted(datas.size() - newData.size() + mHeaderViews.size(), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }


    @NonNull
    @Override
    public T onCreateViewHolder(@NonNull ViewGroup viewGroup, int type) {
        if (isHeaderView(type)) {
            View view = mHeaderViews.get(type);
            return createHeaderViewHolder(view);
        }
        if (isFooterView(type)) {
            View view = mFooterViews.get(type);
            return createBaseViewHolder(view);
        }
        return createVHAndSetListener(viewGroup, type);
    }

    protected T createVHAndSetListener(ViewGroup group, int type) {
        View view = inflateview(group);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        return createVHolder(view, type);
    }

    protected abstract View inflateview(ViewGroup group);

    protected abstract T createVHolder(View view, int type);

    /**
     * get generic parameter K
     *
     * @param z
     * @return
     */
    private Class getInstancedGenericKClass(Class z) {
        Type type = z.getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            Type[] types = ((ParameterizedType) type).getActualTypeArguments();
            for (Type temp : types) {
                if (temp instanceof Class) {
                    Class tempClass = (Class) temp;
                    if (BaseViewHolder.class.isAssignableFrom(tempClass)) {
                        return tempClass;
                    }
                } else if (temp instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) temp).getRawType();
                    if (rawType instanceof Class && BaseViewHolder.class.isAssignableFrom((Class<?>) rawType)) {
                        return (Class<?>) rawType;
                    }
                }
            }
        }
        return null;
    }

    /**
     * if you want to use subclass of BaseViewHolder in the adapter,
     * you must override the method to create new ViewHolder.
     *
     * @param view view
     * @return new ViewHolder
     */
    @SuppressWarnings("unchecked")
    protected T createBaseViewHolder(View view) {
        Class temp = getClass();
        Class z = null;
        while (z == null && null != temp) {
            z = getInstancedGenericKClass(temp);
            temp = temp.getSuperclass();
        }
        T k;
        // 泛型擦除会导致z为null
        if (z == null) {
            k = (T) new RecyclerView.ViewHolder(view) {
            };
        } else {
            k = createGenericKInstance(z, view);
        }
        return k != null ? k : (T) new BaseViewHolder(view);
    }

    /**
     * try to create Generic T instance
     *
     * @param z
     * @param view
     * @return
     */
    @SuppressWarnings("unchecked")
    private T createGenericKInstance(Class z, View view) {
        try {
            Constructor constructor;
            // inner and unstatic class
            if (z.isMemberClass() && !Modifier.isStatic(z.getModifiers())) {
                constructor = z.getDeclaredConstructor(getClass(), View.class);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(this, view);
            } else {
                constructor = z.getDeclaredConstructor(View.class);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(view);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }


    private T createHeaderViewHolder(View view) {
        return createBaseViewHolder(view);
    }

    private boolean isHeaderView(int viewType) {
        int pos = mHeaderViews.indexOfKey(viewType);
        return pos >= 0;
    }

    private boolean isFooterView(int viewType) {
        int pos = mFooterViews.indexOfKey(viewType);
        return pos >= 0;
    }

    private boolean isHeaderViewPos(int i) {
        return i < mHeaderViews.size();
    }

    private boolean isFooterViewPos(int i) {
        return i >= mHeaderViews.size() + getListItemCount();
    }

    @Override
    public void onBindViewHolder(@NonNull T viewHolder, int i) {
        if (isFooterViewPos(i) || isHeaderViewPos(i)) {
            return;
        }
        int pos = i - mHeaderViews.size();
        onBindVHolder(viewHolder, pos);
    }

    protected abstract void onBindVHolder(T holder, int i);

    @Override
    public int getItemViewType(int position) {
        if (isHeaderViewPos(position)) {
            return mHeaderViews.keyAt(position);
        }
        if (isFooterViewPos(position)) {
            position = position - mFooterViews.size() - getListItemCount();
            return mFooterViews.keyAt(position);
        }
        position = position - mHeaderViews.size();
        return getItemViewType2(position);
    }

    protected abstract int getItemViewType2(int pos);

    public abstract int getListItemCount();

    /**
     * 总的
     *
     * @return
     */
    @Override
    public int getItemCount() {
        return mHeaderViews.size() + mFooterViews.size() + getListItemCount();
    }

    public void addHeaderView(View view) {
        if (mHeaderViews != null) {
            int index = mHeaderViews.indexOfValue(view);
            if (index < 0) {
                mHeaderViews.put(TYPE_OF_HEADER, view);
            }
            notifyDataSetChanged();
        }
    }

    public void addFooterView(View view) {
        if (mFooterViews != null) {
            int index = mFooterViews.indexOfValue(view);
            if (index < 0) {
                mFooterViews.put(TYPE_OF_FOOTER, view);
            }
            notifyDataSetChanged();
        }
    }

    public void removeHeaderView(View view) {
        if (mHeaderViews != null) {
            int index = mHeaderViews.indexOfValue(view);
            if (index < 0) {
                return;
            }
            mHeaderViews.removeAt(index);
            notifyDataSetChanged();
        }
    }

    public void removeFooterView(View view) {
        if (mFooterViews != null) {
            int index = mFooterViews.indexOfValue(view);
            if (index < 0) {
                return;
            }
            mFooterViews.removeAt(index);
            notifyDataSetChanged();
        }
    }

    /**
     * 解决GridLayoutManager添加头部和底部不占用一行的问题
     *
     * @param recycler
     * @version 1.0
     */
    public void adjustSpanSize(RecyclerView recycler) {
        if (recycler.getLayoutManager() instanceof GridLayoutManager) {
            final GridLayoutManager layoutManager = (GridLayoutManager) recycler.getLayoutManager();
            layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {
                    boolean isHeaderOrFooter =
                            isHeaderViewPos(position) || isFooterViewPos(position);
                    return isHeaderOrFooter ? layoutManager.getSpanCount() : 1;
                }
            });
        }
    }

    public interface OnItemChildClickListener {
        /**
         * callback method to be invoked when an item in this view has been
         * click and held
         *
         * @param view     The view whihin the ItemView that was clicked
         * @param position The position of the view int the adapter
         */
        void onItemChildClick(AbstractAdapter adapter, View view, int position);
    }
}
