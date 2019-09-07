package com.example.imeeting.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.example.imeeting.R;
import com.example.imeeting.base.view.GlideRoundTransform;

public class GlideUtil {
    private static RequestOptions options ;
    static {
        options = new RequestOptions()
                .placeholder(R.drawable.bg_placeholder)
                .fallback(R.drawable.bg_placeholder)
                .error(R.drawable.bg_placeholder)
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
    }
    /**
     *
     * @param context context
     * @param url image url
     * @param iv imageView
     */
    public static void loadImage(Context context, String url, ImageView iv,int corner) {
        Glide.with(context)
                .load(url)
                .apply(options.transform(new GlideRoundTransform(context,corner))).into(iv);

    }
    public static void loadImage(Context context, int url, ImageView iv,int corner) {
        Glide.with(context)
                .load(url)
                .apply(options.transform(new GlideRoundTransform(context,corner))).into(iv);

    }


    public static void loadGifImage(Context context,String url,ImageView imageView,int count){
        Glide.with(context).load(url).into(new SimpleTarget<Drawable>() {
            @Override
            public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                if (drawable instanceof GifDrawable) {
                    GifDrawable gifDrawable = (GifDrawable) drawable;
                    gifDrawable.setLoopCount(count);
                    imageView.setImageDrawable(drawable);
                    gifDrawable.start();
                }
            }
        });
    }

    public static void loadGifImage(Context context,String url,ImageView imageView){
        Glide.with(context).asGif().load(url).apply(options).into(imageView);
    }
}
