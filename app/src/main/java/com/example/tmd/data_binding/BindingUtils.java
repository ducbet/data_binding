package com.example.tmd.data_binding;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

/**
 * Created by tmd on 12/07/2017.
 */

public class BindingUtils {
    @BindingAdapter("imageResource")
    public static void setImageResource(ImageView imageView, int source){
        imageView.setImageResource(source);
    }
}
