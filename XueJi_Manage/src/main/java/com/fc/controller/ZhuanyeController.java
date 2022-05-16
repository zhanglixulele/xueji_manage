package com.fc.controller;

import com.fc.entity.TZhuanye;
import com.fc.service.ZhuanyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ZhuanyeController {
    @Autowired
    private ZhuanyeService zhuanyeService;
    @GetMapping("zhuanye")
    public ModelAndView getList(ModelAndView modelAndView){
        List<TZhuanye> tZhuanyes = zhuanyeService.getlist();
        modelAndView.addObject("zhuanyeList",tZhuanyes);

        modelAndView.setViewName("forward:admin/zhuanye/zhuanyeMana.jsp");
        return modelAndView;
    }

    @GetMapping("zhuanyeDel")
    public ModelAndView zhuanyeDel(@RequestParam int id){
        return zhuanyeService.zhuanyeDel(id);
    }
    @PostMapping("zhuanyeAdd")
    public ModelAndView zhuanyeAdd(TZhuanye tZhuanye){
        return zhuanyeService.zhuanyeAdd(tZhuanye);
    }


}
