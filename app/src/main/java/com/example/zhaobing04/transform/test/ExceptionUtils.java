package com.example.zhaobing04.transform.test;

import android.util.Log;

public class ExceptionUtils {
    public static void uploadCatchedException(Exception exception) {
        Log.e("ExceptionUtilsTAG", "uploadCatchedException start");
        if (exception == null) {
            return;
        }
        //demo里没有接入异常上报平台，仅仅打了log来测试是否捕获成功
        Log.e("ExceptionUtilsTAG", "uploadCatchedException", exception);
    }
}
