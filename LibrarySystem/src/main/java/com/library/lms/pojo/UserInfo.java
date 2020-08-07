package com.library.lms.pojo;

public class UserInfo {
    private int user_id;
    private String user_account;
    private String user_pw;
    private String user_number;
    private String user_name;
    private int user_age;
    private String user_sex;
    private String user_mark;

    public String getUser_account() {
        return user_account;
    }

    public int getUser_age() {
        return user_age;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_mark() {
        return user_mark;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_number() {
        return user_number;
    }

    public String getUser_pw() {
        return user_pw;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_mark(String user_mark) {
        this.user_mark = user_mark;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_number(String user_number) {
        this.user_number = user_number;
    }

    public void setUser_pw(String user_pw) {
        this.user_pw = user_pw;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "user_id=" + user_id +
                ", user_account='" + user_account + '\'' +
                ", user_pw='" + user_pw + '\'' +
                ", user_number='" + user_number + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_age=" + user_age +
                ", user_sex='" + user_sex + '\'' +
                ", user_mark='" + user_mark + '\'' +
                '}';
    }
}
