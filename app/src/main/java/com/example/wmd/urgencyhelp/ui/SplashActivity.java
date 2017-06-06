package com.example.wmd.urgencyhelp.ui;

/*
 *  项目名：  UrgencyHelp
 *  包名：    com.example.wmd.urgencyhelp.ui
 *  文件名:   LoginActivity
 *  创建者:   WMD
 *  创建时间:  2017/05/01 23:10
 *  描述：    闪屏页
 */


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


import com.example.wmd.urgencyhelp.MainActivity;
import com.example.wmd.urgencyhelp.MyUser;
import com.example.wmd.urgencyhelp.R;
import com.example.wmd.urgencyhelp.utils.StaticClass;
import com.example.wmd.urgencyhelp.utils.UtilTools;

import cn.bmob.v3.BmobUser;


public class SplashActivity extends AppCompatActivity {
    /**
     * 1.延时2000ms
     * 2.判断程序是否第一次运行
     * 3.自定义字体
     * 4.Activity全屏主题
     */

    private TextView tv_splash;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case StaticClass.HANDLER_SPLASH:
                    //判断是否有用户数据缓存
                    //获取当前用户
                    MyUser userInfo = BmobUser.getCurrentUser(MyUser.class);
                    if(userInfo != null){
                        startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    }else{
                        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    }
                    finish();
                break;
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();
    }

    //初始化View
    private void initView() {
        //延时2000ms
        handler.sendEmptyMessageDelayed(StaticClass.HANDLER_SPLASH, 2000);
        tv_splash = (TextView) findViewById(R.id.tv_splash);
        //设置字体
        UtilTools.setFont(this,tv_splash);

    }


}
