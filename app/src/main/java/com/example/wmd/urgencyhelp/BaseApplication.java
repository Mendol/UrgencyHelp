package com.example.wmd.urgencyhelp;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created by WMD on 2017/5/9.
 */

public class BaseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Bmob
        Bmob.initialize(this, "276aab6a3114a5526872d0121325eaf6");

    }
}
