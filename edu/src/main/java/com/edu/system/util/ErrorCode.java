package com.edu.system.util;

public enum ErrorCode implements IErrorCode {
    CONTROLLER_TYPE_ERROR(5000, 500, "数据类型错误"),

    CONTROLLER_LEIGHT_ERROR(5001, 500, "字符长度错误");


    private ErrorCode(int code, int httpStatus, String reason) {
        this.code = code;
        this.httpStatus = httpStatus;
        this.reason = reason;
    }

    /**
     * 自定义异常代码
     */
    private int code;

    /**
     * http错误状态码
     */
    private int httpStatus;

    /**
     * 异常提示信息
     */
    private String reason;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
