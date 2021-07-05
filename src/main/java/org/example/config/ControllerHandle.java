package org.example.config;

import org.example.dto.BaseResponse;
import org.example.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 */
@ControllerAdvice
@ResponseBody
public class ControllerHandle {

    private static final Logger LOG = LoggerFactory.getLogger(ControllerHandle.class);
    @ExceptionHandler(value = Exception.class)
    public BaseResponse exception(Exception e) {
        //自定义异常
        LOG.error(e.getLocalizedMessage());
        //参数异常
        return ResponseUtil.error("操作失败");
    }
}
