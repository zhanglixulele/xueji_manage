package com.fc.controller;

import com.fc.entity.TJiangcheng;
import com.fc.service.JiangChengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("admin")
public class jiangchengController {
    @Autowired
    private JiangChengService jiangChengService;

    @GetMapping("jiangcheng")
    public ModelAndView getList(ModelAndView modelAndView,
                                HttpServletResponse response,
                                HttpServletRequest request){
        List<TJiangcheng> jj = jiangChengService.getAll();
        request.setAttribute("p",jj);
        modelAndView.setViewName("forward:jiangcheng/jiangchengMana.jsp");
        return modelAndView;
    }

    @GetMapping("jiangcheng/jiangchengDel")
    public ModelAndView jiangchengDel(@RequestParam int id){
        return jiangChengService.jiangchengDel(id);
    }

    @PostMapping("jiangcheng/jiangchengAdd")
    public ModelAndView jiangchengAdd(TJiangcheng jiangcheng){return jiangChengService.add(jiangcheng);}
}
