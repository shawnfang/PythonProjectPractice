package com.education.system.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lombok.Data;

import java.io.Serializable;


/***
 * api请求参数模型
 *
 * @author Kevin
 *
 */
@Data
public class ApiRequestParam<T> implements Serializable {
    private static final long serialVersionUID = -3287046344305235758L;

    /**
     * 跳转方法
     */
    private String method;

    /**
     * 方法参数
     */
    private T args;

    public ApiRequestParam() {
    }

    public ApiRequestParam(String method, T args) {
        super();
        this.method = method;
        this.args = args;
    }

    /**
     * 将args转换为指定的参数模型
     *
     * @param typeRefer type类型
     * @return R
     */
    public <R> R getArgsValue(TypeReference<R> typeRefer) {
        if (args == null || typeRefer == null) {
            return null;
        }

        if (args.getClass() == String.class) {
            return JSON.parseObject((String) args, typeRefer);
        }

        return null;
    }
}