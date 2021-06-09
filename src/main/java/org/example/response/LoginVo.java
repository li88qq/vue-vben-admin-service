package org.example.response;

import org.example.dto.RoleInfo;

import java.io.Serializable;

public class LoginVo implements Serializable {

    private Integer userId;
    private String token;
    private RoleInfo role;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setRole(RoleInfo role) {
        this.role = role;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public RoleInfo getRole() {
        return role;
    }
}
