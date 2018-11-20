package com.mobile_core.base.utils;

import android.databinding.BindingAdapter;
import android.graphics.PorterDuff;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.mobile_core.base.Constants;
import com.mobile_core.base.R;
import com.mobile_core.base.manager.SharedPrefManager;

/**
 * Created by picher on 2018/7/20.
 * Describe：
 */

public class BindingUtils {

    @BindingAdapter({"imageUrl"})
    public static void loadImg(ImageView v, String url) {
        Glide.with(v.getContext())
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(v);
    }
}
