package org.example.controller;

import org.example.dto.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 部门
 */
@RestController
@RequestMapping("/system")
public class DeptController {

    @GetMapping("/getDeptList")
    public BaseResponse getDeptList() {
        return null;
    }
}
