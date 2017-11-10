package com.ctbu.latte.util.dimen;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.ctbu.latte.app.Latte;

/**
 * Created by chenting on 2017/11/9.
 */

public class DimenUtil {
    public static int getScreenWidth() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
