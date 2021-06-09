package org.example.config;

import org.example.dto.BaseResponse;
import org.example.utils.ResponseUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 */
@ControllerAdvice
@ResponseBody
public class ControllerHandle {

    @ExceptionHandler(value = Exception.class)
    public BaseResponse Exception() {
        //自定义异常
        //参数异常
        return ResponseUtil.error("操作失败");
    }
}
