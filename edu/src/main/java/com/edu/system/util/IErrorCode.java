package com.edu.system.util;

public interface IErrorCode {
    /**
     * 获取错误代码code
     *
     * @return code
     */
    public int getCode();

    /**
     * 获取错误代码的httpStatus
     *
     * @return httpStatus
     */
    public int getHttpStatus();

    /**
     * 获取错误代码原因
     *
     * @return reason
     */
    public String getReason();
}
