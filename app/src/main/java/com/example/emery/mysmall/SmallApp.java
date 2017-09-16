package com.example.emery.mysmall;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by emery on 2017/4/6.
 */

public class SmallApp extends Application {
    {
        Small.preSetUp(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //BuildConfig.LOAD_FROM_ASSETS 将会被 Small 自动赋值为你配置的 buildToAssets
        Small.setLoadFromAssets(BuildConfig.LOAD_FROM_ASSETS);
    }
}
