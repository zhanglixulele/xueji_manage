package com.fc.controller;

import com.fc.service.AdminService;
import com.fc.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("login")
    public ResultVo login(@RequestParam String userName,
                          @RequestParam String userPm){
        return adminService.login(userName,userPm);
    }
    @PostMapping("getlist")
    public ResultVo getlist(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                            @RequestParam(value = "pageSize", defaultValue = "3")  Integer pageSize,
                            Long userId) {
        return adminService.getList(pageNum, pageSize, userId);
    }
}
