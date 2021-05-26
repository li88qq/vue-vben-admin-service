package org.example.serviceImpl;

import org.example.dto.BaseResponse;
import org.example.request.LoginForm;
import org.example.service.ILoginService;
import org.example.utils.ResponseUtil;
import org.springframework.stereotype.Service;

/**
 * 登录服务
 */
@Service
public class LoginService implements ILoginService {

    /**
     * 登录
     *
     * @param form
     * @return
     */
    @Override
    public BaseResponse login(LoginForm form) {
        return ResponseUtil.ok();
    }
}
