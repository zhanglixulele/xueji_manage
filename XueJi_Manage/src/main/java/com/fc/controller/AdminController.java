package com.fc.controller;

import com.fc.service.AdminService;
import com.fc.vo.ResultVO;
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

    @PostMapping("loginService")
    public ResultVO login(@RequestParam String userName,
                          @RequestParam String userPw){
        return adminService.login(userName,userPw);
    }

}
