package com.fc.controller;

import com.fc.entity.TBanji;
import com.fc.service.BanjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin("*")
@RestController
public class BanjiController {
    @Autowired
    private BanjiService banjiService;
    @GetMapping("banji")
    public ModelAndView getList(ModelAndView modelAndView,
                                HttpServletRequest request){
        List<TBanji> tBanjis = banjiService.getlist();
        modelAndView.addObject("banjiList",tBanjis);

        modelAndView.setViewName("forward:admin/banji/banjiMana.jsp");
        return modelAndView;
    }
    @GetMapping("banjiDel")
    public ModelAndView banjiDel(@RequestParam int id){
        return banjiService.banjiDel(id);
    }
    @PostMapping("banjiAdd")
    public ModelAndView banjjiAdd(TBanji tBanji){
        return banjiService.banjiAdd(tBanji);
    }
}
