package com.zhangmiao.livewallpaper;

/**
 * Author: zhangmiao
 * Date: 2017/6/15
 */
public class MyLog {
    private static final String sTag = "WallPaper";

    public static void d(String msg, Object... params) {
        MyLog.d(sTag, String.format(msg, params));
    }
}
