package com.github.namelesspeople.libjpegstudy;

import android.graphics.Bitmap;

/**
 * 类描述：
 * 创建人： 张力
 * 创建时间： 2018/6/13
 * 版权： 成都智慧一生约科技有限公司
 */
public class JpegNative {
    static {
        System.loadLibrary("native-lib");
//        System.loadLibrary("jpeg");
    }
    public static native int compressBitmap(Bitmap bitmap, int quality, String fileNameStr, boolean optimize);
}
