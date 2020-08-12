package com.library.lms.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import java.io.Serializable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lombok.Data;
import java.io.Serializable;
import org.apache.commons.lang.StringUtils;

/***
 * api返回值模型
 *
 * @author Kevin
 *
 */
@Data
public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = 1271253060972891256L;

    /**
     * api返回状态
     */
    private boolean success = true;

    /**
     * api返回值
     */
    private T result;

    /**
     * 异常信息
     */
    private String errorMsg;

    public ApiResult() {
        super();
    }

    /**
     * 创建成功的apiRsult
     *
     * @param <R>
     *
     * @return apiResult
     */
    public static <R> ApiResult<R> newSuccess() {
        return newSuccess(null);
    }

    /**
     * 创建错误的apiRsult
     *
     * @param <R>
     *
     * @param errorMsg 错误信息
     * @return apiResult
     */
    public static <R> ApiResult<R> newError(String errorMsg) {
        ApiResult<R> apiResult = new ApiResult<>();
        apiResult.setSuccess(false);
        apiResult.setErrorMsg(errorMsg);

        return apiResult;
    }

    /**
     * 创建成功的apiRsult
     *
     * @param result 返回值
     * @return apiResult
     */
    public static <R> ApiResult<R> newSuccess(R result) {
        ApiResult<R> apiResult = new ApiResult<>();
        apiResult.setResult(result);
        return apiResult;
    }

    /**
     * 生成apiResult
     *
     * @param success
     * @param result
     * @param errorMsg
     * @return
     */
    public static <R> ApiResult<R> of(boolean success, R result, String errorMsg) {
        ApiResult<R> apiResult = new ApiResult<>();
        apiResult.setSuccess(success);
        apiResult.setResult(result);
        apiResult.setErrorMsg(errorMsg);

        return apiResult;
    }

    /**
     * description: 转换为指定类型
     *
     * @param
     * @return
     * @auther: lizh
     * @date: 2018/10/29
     * @version: 0.0.1
     */
    public <R> R getResultValue(TypeReference<R> typeRefer) {
        if (result == null || typeRefer == null) {
            return null;
        }

        if (result.getClass() == String.class) {
            return JSON.parseObject((String) result, typeRefer);
        }

        return null;
    }

    /**
     * 连接是否被拒绝，服务中断
     *
     * @return
     */
    public boolean isConnectionRefused() {
        return StringUtils.isNotEmpty(errorMsg) && errorMsg.contains("Connection refused");
    }
}

