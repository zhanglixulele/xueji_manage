package com.fc.controller;

import com.fc.entity.TChengji;
import com.fc.entity.TJiangcheng;
import com.fc.service.ChengjiService;
import com.fc.service.JiangChengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("admin")
public class chengjiController {
    @Autowired
    private ChengjiService chengjiService;

    @GetMapping("chengji")
    public ModelAndView getList(ModelAndView modelAndView,
                                HttpServletResponse response,
                                HttpServletRequest request){
        List<TChengji> jj = chengjiService.getAll();
        request.setAttribute("p",jj);
        modelAndView.setViewName("forward:chengji/chengjiMana.jsp");
        return modelAndView;
    }

    @GetMapping("chengji/chengjiDel")
    public ModelAndView chengjiDel(@RequestParam int id){
        return chengjiService.chengjiDel(id);
    }

    @PostMapping("chengji/chengjiAdd")
    public ModelAndView chengjiAdd(TChengji chengji){return chengjiService.add(chengji);}
}
