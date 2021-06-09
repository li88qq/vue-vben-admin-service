package org.example.serviceImpl;

import org.example.dto.BaseResponse;
import org.example.dto.RoleInfo;
import org.example.request.LoginForm;
import org.example.response.GetUserInfoVo;
import org.example.response.LoginVo;
import org.example.service.ILoginService;
import org.example.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
        String username = form.getUsername();
        String password = form.getPassword();
        if (!"vben".equals(username)) {
            return ResponseUtil.error("用户名或密码错误");
        }
        if (!"123456".equals(password)) {
            return ResponseUtil.error("用户名或密码错误");
        }

        RoleInfo roleInfo = new RoleInfo();
        roleInfo.setRoleName("admin");
        roleInfo.setValue("admin");

        LoginVo vo = new LoginVo();
        vo.setUserId(1);
        vo.setToken(UUID.randomUUID().toString());
        vo.setRole(roleInfo);

        return ResponseUtil.ok(vo);
    }

    @Override
    public BaseResponse getUserInfo() {
        List<RoleInfo> roles = new ArrayList<>();
        RoleInfo roleInfo = new RoleInfo();
        roleInfo.setRoleName("admin");
        roleInfo.setValue("admin");

        roles.add(roleInfo);

        GetUserInfoVo vo = new GetUserInfoVo();
        vo.setUserId(1);
        vo.setUsername("vben");
        vo.setRealName("vben");
        vo.setAvatar("");
        vo.setDesc("");
        vo.setRoles(roles);
        return ResponseUtil.ok(vo);
    }
}
