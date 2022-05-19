package com.fc.controller;

import com.fc.entity.TKecheng;
import com.fc.service.KechengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("admin")
public class KechengController {
    @Autowired
    private KechengService kechengService;

    @RequestMapping("kecheng")
    public ModelAndView getList(ModelAndView modelAndView,
                                HttpServletResponse response,
                                HttpServletRequest request){
        List<TKecheng> jj = kechengService.getAll();
        request.setAttribute("p",jj);
        modelAndView.setViewName("forward:kecheng/kechengMana.jsp");
        return modelAndView;
    }
    @RequestMapping("kecheng/kechengDel")
    public ModelAndView kechengDel(@RequestParam int id){
        return kechengService.kechengDel(id);
    }

    @PostMapping("kecheng/kechengAdd")
    public ModelAndView kechengAdd(TKecheng kecheng){
        return kechengService.kechengAdd(kecheng);
    }



}
