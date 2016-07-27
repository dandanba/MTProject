package cn.maitian.util;

import android.os.StrictMode;

/**
 * Created by geng on 2016/7/27.
 */
public class StrictModeUtil {
    public static void setThreadPolicy() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
    }

    public static void setVmPolicy() {
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
    }
}
