package org.example.utils;

import org.example.dto.BaseResponse;

/**
 * 响应工具类
 */
public class ResponseUtil {

    /**
     * 响应成功
     *
     * @return
     */
    public static BaseResponse ok() {
        return response(0, "请求成功", null);
    }

    /**
     * 响应成功
     *
     * @return
     */
    public static BaseResponse ok(Object result) {
        return response(0, "请求成功", result);
    }

    /**
     * 响应失败
     *
     * @param message
     * @return
     */
    public static BaseResponse error(String message) {
        return response(1, message, null);
    }

    /**
     * 响应失败
     *
     * @param code
     * @param message
     * @return
     */
    public static BaseResponse error(int code, String message) {
        return response(code, message, null);
    }

    /**
     * 响应
     *
     * @param code
     * @param message
     * @param result
     * @return
     */
    public static BaseResponse response(int code, String message, Object result) {
        BaseResponse response = new BaseResponse(code, message, result);
        return response;
    }
}
