/*
 *     (C) Copyright 2019, ForgetSky.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package com.example.imeeting.utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.example.imeeting.R;
import com.example.imeeting.app.IMeetingApplication;
import com.google.zxing.common.StringUtils;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtils {

    public static void jumpUiUtil(Context context, Intent intent) {
        context.startActivity(intent);
    }

    public static boolean isNetworkConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) IMeetingApplication.getContext().getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        assert connectivityManager != null;
        NetworkInfo info = connectivityManager.getActiveNetworkInfo();
        return info != null && info.isConnected();
    }


    public static int getRandomColor() {
        Random random = new Random();
        //0-190, 如果颜色值过大,就越接近白色,就看不清了,所以需要限定范围
        int red;
        int green;
        int blue;
        if (IMeetingApplication.isNightMode()) {
//            150-255
            red = random.nextInt(105) + 150;
            green = random.nextInt(105) + 150;
            blue = random.nextInt(105) + 150;
        } else {
            red = random.nextInt(190);
            green = random.nextInt(190);
            blue = random.nextInt(190);
        }
        //使用rgb混合生成一种新的颜色,Color.rgb生成的是一个int数
        return Color.rgb(red, green, blue);
    }

    public static AlertDialog getLoadingDialog(Context context, String message) {
        View view = LayoutInflater.from(context).inflate(R.layout.loading_progressbar, null, false);
        TextView loadingText = view.findViewById(R.id.loading_text);
        loadingText.setText(message);
        AlertDialog dialog = new AlertDialog.Builder(context).setView(view).create();
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        return dialog;
    }

    public static void hideKeyBoard(Context context, View view) {
        InputMethodManager inputMethodManager =
                (InputMethodManager) context.getApplicationContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        if (inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    public static String getCurrentDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat.getDateInstance();
        return simpleDateFormat.format(new Date());
    }

    public static Calendar dateString2Calendar(String dateString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static PopupWindow showPopupWindow(View anchorView, View contentView) {
        final PopupWindow popupWindow = new PopupWindow(contentView,
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
        popupWindow.setBackgroundDrawable(contentView.getBackground());
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        int windowPos[] = calculatePopWindowPos(anchorView, contentView);
        popupWindow.showAtLocation(anchorView, Gravity.NO_GRAVITY, windowPos[0], windowPos[1]);
        return popupWindow;
    }

    /**
     * 计算出来的位置，y方向就在anchorView的中心对齐显示，x方向就是与View的中心点对齐
     *
     * @param anchorView  呼出window的view
     * @param contentView window的内容布局
     * @return window显示的左上角的xOff, yOff坐标
     */
    private static int[] calculatePopWindowPos(final View anchorView, final View contentView) {
        final int windowPos[] = new int[2];
        final int anchorLoc[] = new int[2];
        anchorView.getLocationOnScreen(anchorLoc);
        final int anchorHeight = anchorView.getHeight();
        final int anchorWidth = anchorView.getWidth();
        final int screenHeight = anchorView.getContext().getResources().getDisplayMetrics().heightPixels;
        final int screenWidth = anchorView.getContext().getResources().getDisplayMetrics().widthPixels;
        contentView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
        final int windowHeight = contentView.getMeasuredHeight();
        final int windowWidth = contentView.getMeasuredWidth();
        // 判断需要向上弹出还是向下弹出显示
        final boolean isNeedShowUp = (anchorLoc[1] > screenHeight / 3);
        //偏移，否则会弹出在屏幕外
        int offset = windowWidth > anchorWidth ? (windowWidth - anchorWidth) : 0;
        //实际坐标中心点为触发view的中间
        windowPos[0] = (anchorLoc[0] + anchorWidth / 2) + offset;
        int offset2 = windowPos[0] + windowWidth - screenWidth;
        if (offset2 > 0) {
            windowPos[0] = windowPos[0] - offset2;
        }
        windowPos[1] = isNeedShowUp ? anchorLoc[1] - windowHeight + anchorHeight / 2 : anchorLoc[1] + anchorHeight / 2;
        return windowPos;
    }

    /**
     * 触发默认的notification
     *
     * @param context
     */
    public static void notifyNotification(Context context, int requestcode, Intent intent) {
        PendingIntent pendingIntent = PendingIntent.getActivity(context, requestcode, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= 26) {
            String id = "id1";
            String desc = "test";
            int importance = NotificationManager.IMPORTANCE_LOW;
            NotificationChannel channel = new NotificationChannel(id, desc, importance);
            manager.createNotificationChannel(channel);
            Notification.Builder builder = new Notification.Builder(context, id);
            builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.drawable.story_select));
            builder.setSmallIcon(R.mipmap.ic_launcher);
            builder.setContentTitle("test");
            builder.setContentIntent(pendingIntent);
            builder.setAutoCancel(true);
            manager.notify(1, builder.build());

        } else {
            Notification.Builder builder = new Notification.Builder(context);
            builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.drawable.story_select));
            builder.setSmallIcon(R.mipmap.ic_launcher);
            builder.setContentTitle("test");
            builder.setContentIntent(pendingIntent);
            builder.setAutoCancel(true);
            manager.notify(1, builder.build());

        }
    }

    public static void buildNotiation(Context context, int requestCode, String title) {
        Notification.Builder builder;
        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel("id", "name", NotificationManager.IMPORTANCE_LOW);
            manager.createNotificationChannel(channel);
            builder = new Notification.Builder(context, "id");
        } else {
            builder = new Notification.Builder(context);
            builder.setSmallIcon(R.mipmap.ic_launcher);
            builder.setContentTitle(title);
            builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.drawable.story_select));

        }
    }

    public static boolean stringIsNull(String s) {
        if (s == null) {
            return true;
        }
        if ("".equals(s)) {
            return true;
        }
        return false;
    }

    public static PopupWindow showPopupWindowFromUpToDown(View contentView, View parentView) {
        PopupWindow window = new PopupWindow(contentView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
        window.setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        window.setOutsideTouchable(true);
        window.setTouchable(true);
        //window.setAnimationStyle(R.style.animTranslateDown);
        window.showAsDropDown(parentView);
        return window;
    }

    public static int getScreenWidth(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;         // 屏幕宽度（像素）
        /*int height = dm.heightPixels;       // 屏幕高度（像素）
        float density = dm.density;         // 屏幕密度（0.75 / 1.0 / 1.5）
        int densityDpi = dm.densityDpi;     // 屏幕密度dpi（120 / 160 / 240）
        // 屏幕宽度算法:屏幕宽度（像素）/屏幕密度
        int screenWidth = (int) (width / density);  // 屏幕宽度(dp)*/
        return width;
    }

    public static int getScreenHeight(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        /*wm.getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;         // 屏幕宽度（像素）*/
        int height = dm.heightPixels;       // 屏幕高度（像素）
        /*float density = dm.density;         // 屏幕密度（0.75 / 1.0 / 1.5）
        int densityDpi = dm.densityDpi;     // 屏幕密度dpi（120 / 160 / 240）*/
        //return (int) (height / density);// 屏幕高度(dp)
        return height;
    }

    /**
     * 实体类转Map
     *
     * @param object
     * @return
     */
    public static Map<String, String> entityToMap(Object object) {
        Map<String, String> map = new HashMap();
        for (Field field : object.getClass().getDeclaredFields()) {
            try {
                boolean flag = field.isAccessible();
                field.setAccessible(true);
                String temp = (String) field.get(object);
                String o = temp == null ? "" : temp;
                map.put(field.getName(), o);
                field.setAccessible(flag);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    /**
     * Map转实体类
     *
     * @param map    需要初始化的数据，key字段必须与实体类的成员名字一样，否则赋值为空
     * @param entity 需要转化成的实体类
     * @return
     */
    public static <T> T mapToEntity(Map<String, Object> map, Class<T> entity) {
        T t = null;
        try {
            t = entity.newInstance();
            for (Field field : entity.getDeclaredFields()) {
                if (map.containsKey(field.getName())) {
                    boolean flag = field.isAccessible();
                    field.setAccessible(true);
                    Object object = map.get(field.getName());
                    if (object != null && field.getType().isAssignableFrom(object.getClass())) {
                        field.set(t, object);
                    }
                    field.setAccessible(flag);
                }
            }
            return t;
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return t;
    }

    public static int dip2px(Context context, float dipValue) {

        final float scale = context.getResources().getDisplayMetrics().density;

        return (int) (dipValue * scale + 0.5f);

    }

    public static int px2dip(Context context, float pxValue) {

        final float scale = context.getResources().getDisplayMetrics().density;

        return (int) (pxValue / scale + 0.5f);

    }

    public static Bitmap convertViewToBitmap(View view) {
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap bitmap = view.getDrawingCache();
        return bitmap;
    }

    /**
     * 拨打电话（跳转到拨号界面，用户手动点击拨打）
     *
     * @param phoneNum 电话号码
     */
    public static void callPhone(Context context, String phoneNum) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        Uri data = Uri.parse("tel:" + phoneNum);
        intent.setData(data);
        context.startActivity(intent);
    }

    /**
     * 正则表达式：验证手机号
     */

    public static final String REGEX_MOBILE = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";

    /**
     * 校验手机号
     *
     * @param mobile
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isMobile(String mobile) {
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        String s2 = "^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$";// 验证手机号
        if (mobile == null || "".equals(mobile.trim())) {
            return false;
        }
        p = Pattern.compile(s2);
        m = p.matcher(mobile);
        b = m.matches();
        return b;
    }
}
