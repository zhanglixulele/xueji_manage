package com.fc.service.impl;

import com.fc.dao.TZhuanyeMapper;
import com.fc.entity.TZhuanye;
import com.fc.service.ZhuanyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class ZhuanyeServiceImpl implements ZhuanyeService {
    @Autowired
    private TZhuanyeMapper tZhuanyeMapper;

    @Override
    public List<TZhuanye> getlist() {
            List<TZhuanye> tZhuanyes =tZhuanyeMapper.selectByExample(null);
            return tZhuanyes;
    }

    @Override
    public ModelAndView zhuanyeDel(int id) {
        int affectRows = tZhuanyeMapper.deleteByPrimaryKey(id);
        ModelAndView modelAndView =new ModelAndView();
        if (affectRows >0) {
            modelAndView.setViewName("redirect:/zhuanye");
        }else {
            System.out.println("失败");
        }

        return modelAndView;
    }

    @Override
    public ModelAndView zhuanyeAdd(TZhuanye tZhuanye) {
        int affectrows = tZhuanyeMapper.insertSelective(tZhuanye);
        ModelAndView modelAndView = new ModelAndView();
        if (affectrows>0){
            modelAndView.setViewName("redirect:/zhuanye");
        }
        else {
            System.out.println("失败");
        }
        return modelAndView;
    }
}
