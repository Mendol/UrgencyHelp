package com.example.wmd.urgencyhelp.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/*
 *  项目名：  UrgencyHelp
 *  包名：    com.example.wmd.urgencyhelp.utils
 *  文件名:   UtilTools
 *  创建者:   WMD
 *  创建时间:  2017/05/01 23:10
 *  描述：工具统一类
 */

public class UtilTools {
    //设置字体
    public static void setFont(Context mContext, TextView textview) {
        Typeface fontType = Typeface.createFromAsset(mContext.getAssets(), "fonts/FONT.TTF");
        textview.setTypeface(fontType);
    }
}
