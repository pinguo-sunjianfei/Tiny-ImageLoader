package com.tiny.imageloader.simples;

import android.app.Application;

import com.tiny.loader.*;
import com.tiny.loader.BuildConfig;
import com.tiny.loader.internal.utils.L;

/**
 * time:2016/9/2
 * description:
 *
 * @author sunjianfei
 */
public class TinyApplication extends Application {
    public static TinyApplication gContext;

    @Override
    public void onCreate() {
        super.onCreate();
        gContext = this;
        //初始化TinyImageLoader
        TinyImageLoader.init(this, FileUtil.getPathByType(FileUtil.DIR_TYPE_CACHE));
        //3.初始化TinyImageLoader当中的日志系统
        L.writeDebugLogs(BuildConfig.DEBUG);
    }
}
