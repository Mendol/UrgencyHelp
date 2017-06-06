package com.example.wmd.urgencyhelp;

import android.text.LoginFilter;

import cn.bmob.v3.BmobUser;

/**
 * Created by WMD on 2017/5/10.
 */

public class MyUser extends BmobUser {
    private int age;
    private boolean sex;
    private String desc;
    private String phone;
    private String content;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public  String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }


}
