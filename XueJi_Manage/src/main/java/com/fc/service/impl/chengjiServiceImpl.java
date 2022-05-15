package com.fc.service.impl;

import com.fc.dao.TChengjiMapper;
import com.fc.entity.TChengji;
import com.fc.service.ChengjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Service
public class chengjiServiceImpl implements ChengjiService {
    @Autowired
    private TChengjiMapper chengjiDao;
    @Override
    public List<TChengji> getAll() {
        List<TChengji> tChengjis = chengjiDao.selectByExample(null);
        return tChengjis;
    }

    @Override
    public ModelAndView chengjiDel(int id) {
        int i = chengjiDao.deleteByPrimaryKey(id);
        ModelAndView mv =new ModelAndView();
        if (i >0) {
            mv.setViewName("redirect:/admin/chengji");
        }else {
            System.out.println("失败");
        }

        return mv;
    }

    @Override
    public ModelAndView add(TChengji chengji) {
        ModelAndView mv =new ModelAndView();
        int affectedRows = chengjiDao.insertSelective(chengji);
        if (affectedRows>0) {
            mv.setViewName("redirect:/admin/chengji");
        }else {
            System.out.println("失败");

        }
        return mv;
    }


}
