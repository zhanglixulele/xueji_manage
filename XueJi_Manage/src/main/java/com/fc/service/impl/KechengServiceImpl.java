package com.fc.service.impl;

import com.fc.dao.TKechengMapper;
import com.fc.entity.TKecheng;
import com.fc.service.KechengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service


public class KechengServiceImpl implements KechengService {
    @Autowired
    private TKechengMapper kechengDao;

    @Override
    public List<TKecheng> getAll() {
        List<TKecheng> tKechengs = kechengDao.selectByExample(null);
        return tKechengs;
    }

    @Override
    public ModelAndView kechengDel(int id) {
        int i = kechengDao.deleteByPrimaryKey(id);
        ModelAndView mv = new ModelAndView();
        if (i>0){
            mv.setViewName("redirect:/admin/kecheng");
        }else {
            mv.setViewName("失败");
        }
        return mv;
    }

    @Override
    public ModelAndView kechengAdd(TKecheng kecheng) {
        int i = kechengDao.insertSelective(kecheng);
        ModelAndView mv = new ModelAndView();
        if (i>0){
            mv.setViewName("redirect:/admin/kecheng");
        }else {
            mv.setViewName("失败");
        }
        return mv;
    }
}
