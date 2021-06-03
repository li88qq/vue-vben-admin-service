package org.example.config;

import org.example.dto.BaseResponse;
import org.example.utils.ResponseUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 统一异常处理
 */
@ControllerAdvice
public class ControllerHandle {

    @ExceptionHandler
    public BaseResponse Exception() {
        //自定义异常
        //参数异常
        return ResponseUtil.error("");
    }
}
