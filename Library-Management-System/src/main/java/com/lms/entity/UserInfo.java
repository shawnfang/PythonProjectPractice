package com.lms.entity;

public class UserInfo {
    private int userId;
    private String userCount;
    private String userPw;
    private String userNumber;
    private String userName;
    private int userAge;
    private String userSex;
    private String userMark;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getUserCount() {
        return userCount;
    }

    public String getUserMark() {
        return userMark;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public String getUserPw() {
        return userPw;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserCount(String userCount) {
        this.userCount = userCount;
    }

    public void setUserMark(String userMark) {
        this.userMark = userMark;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userCount='" + userCount + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userNumber='" + userNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userSex='" + userSex + '\'' +
                ", userMark='" + userMark + '\'' +
                '}';
    }
}
