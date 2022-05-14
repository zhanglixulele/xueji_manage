package com.fc.service.impl;

import com.fc.dao.TBanjiMapper;
import com.fc.entity.TBanji;
import com.fc.service.BanjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class BanjiServiceImpl implements BanjiService {
    @Autowired
    private TBanjiMapper tBanjiMapper;

    @Override
    public List<TBanji> getlist() {
        List<TBanji> tBanjis =tBanjiMapper.selectByExample(null);
        return tBanjis;
    }

    @Override
    public ModelAndView banjiDel(int id) {
        ModelAndView modelAndView = new ModelAndView();
        int affectRows = tBanjiMapper.deleteByPrimaryKey(id);
        if (affectRows>0){
            modelAndView.setViewName("redirect:/banji");
        }
        else {
            System.out.println("删除失败");
        }
        return modelAndView;
    }

    @Override
    public ModelAndView banjiAdd(TBanji tBanji) {
        ModelAndView modelAndView=new ModelAndView();
        int affectRows = tBanjiMapper.insertSelective(tBanji);
        if (affectRows>0){
            modelAndView.setViewName("redirect:/banji");
        }
        else {
            System.out.println("删除失败");
        }
        return modelAndView;
    }
}
