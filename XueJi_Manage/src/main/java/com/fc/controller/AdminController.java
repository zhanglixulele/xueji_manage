package com.fc.controller;

import com.fc.service.AdminService;
import com.fc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

   /* @PostMapping("loginService")
    public ResultVO login(@RequestParam String userName,
                          @RequestParam String userPw){


        return adminService.login(userName,userPw);

    }*/
        @PostMapping("loginService")
        public ModelAndView login1(@RequestParam String userName,
                @RequestParam String userPw,
                Integer remember,
                HttpSession session,
                HttpServletResponse response,
                ModelAndView mv){
            //在这里写逻辑
            ResultVO vo = adminService.login(userName, userPw);

            if (vo.getCode()==0){
                //登录失败
                mv.addObject("resultInfo",vo);

                mv.setViewName("forward:/login.jsp");
            }else {
                //登录成功
                session.setAttribute("admin",vo.getData());

                Cookie cookie;
                if (remember!=null&&remember==1){
                    cookie = new Cookie("JSESSIONID", session.getId());

                    cookie.setMaxAge(30 * 60);
                }else {
                    cookie = new Cookie("JSESSIONID", null);

                    cookie.setMaxAge(-1);
                }
                response.addCookie(cookie);

                mv.setViewName("forward:/admin/left.jsp");
            }
            return mv;
        }
        @GetMapping("loginout")
        public ModelAndView loginOut(HttpSession session,
                HttpServletResponse response,
                ModelAndView mv){
            Cookie cookie = new Cookie("JSESSIONID", null);

            //销毁cookie
            cookie.setMaxAge(0);

            response.addCookie(cookie);

            session.removeAttribute("admin");

            //销毁session
            session.invalidate();

            //重定向到登录
            mv.setViewName("redirect:/login.jsp");
            return mv;
        }
    }


