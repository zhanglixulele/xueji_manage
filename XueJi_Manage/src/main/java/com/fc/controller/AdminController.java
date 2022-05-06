package com.fc.controller;

import com.fc.entity.TAdmin;
import com.fc.service.AdminService;
import com.fc.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;


    @PostMapping("login")
    public ModelAndView login(TAdmin admin,
                              Integer remember,
                              HttpSession session,
                              ModelAndView mv){

        ResultVo vo=adminService.login(admin.getUsername(),admin.getUserpw());

        if (vo.getCode()==0){
            //login fail
            mv.addObject("resultInfo",vo);

            mv.setViewName("forward:/login.jsp");
        }else {
            //login success
            session.setAttribute("admin",vo.getData());

            if (remember!= null & remember==1){

            }

            mv.setViewName("forward:/index.jsp");
        }
        return mv;
    }
}
