package com.zhangmiao.livewallpaper;

import android.util.Log;

/**
 * Author: zhangmiao
 * Date: 2017/6/15
 */
public class MyLog {
    private static final String sTag = "WallPaper";

    public static void d(String msg, Object... params) {
        Log.d(sTag, String.format(msg, params));
    }
}
