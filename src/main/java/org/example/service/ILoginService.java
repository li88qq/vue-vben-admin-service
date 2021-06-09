package org.example.service;

import org.example.dto.BaseResponse;
import org.example.request.LoginForm;

/**
 * 登录接口
 */
public interface ILoginService {

    /**
     * 登录
     * @param form
     * @return
     */
    BaseResponse login(LoginForm form);

    BaseResponse getUserInfo();
}
