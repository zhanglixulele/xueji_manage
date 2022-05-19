package com.fc.controller;

import com.fc.entity.TKecheng;
import com.fc.entity.TStu;
import com.fc.service.KechengService;
import com.fc.service.StuService;
import com.fc.vo.ResultVO;
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
public class StuController {
    @Autowired
    private StuService stuService;

    @RequestMapping("stu")
    public ModelAndView getList(ModelAndView modelAndView,
                                HttpServletResponse response,
                                HttpServletRequest request){
        List<TStu> jj = stuService.getAll();
        request.setAttribute("p",jj);
        modelAndView.setViewName("forward:stu/stuMana.jsp");
        return modelAndView;
    }
    @RequestMapping("stu/stuDel")
    public ModelAndView stuDel(@RequestParam int id){
        return stuService.stuDel(id);
    }
    @PostMapping("stu/stuAdd")
    public ModelAndView stuAdd(TStu stu){
        return stuService.add(stu);
    }
    @PostMapping("stu/stuUpdate")
    public ModelAndView stuUpdate(TStu stu){
        return stuService.stuUpdate(stu);
    }
}
