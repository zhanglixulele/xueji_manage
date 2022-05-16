package com.fc.service.impl;

import com.fc.dao.TJiangchengMapper;
import com.fc.entity.TJiangcheng;
import com.fc.service.JiangChengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class jiangchengServiceImpl  implements JiangChengService {
    @Autowired
    private TJiangchengMapper jiangchengDao;

    @Override
    public List<TJiangcheng> getAll() {
        List<TJiangcheng> tJiangchengs = jiangchengDao.selectByExample(null);

        return tJiangchengs;
    }

    @Override
    public ModelAndView jiangchengDel(int id) {
        int i = jiangchengDao.deleteByPrimaryKey(id);
        ModelAndView mv =new ModelAndView();
        if (i >0) {
                mv.setViewName("redirect:/admin/jiangcheng");
        }else {
            System.out.println("失败");
        }

        return mv;
    }

    @Override
    public ModelAndView add(TJiangcheng jiangcheng) {
        ModelAndView mv =new ModelAndView();
        int affectedRows = jiangchengDao.insertSelective(jiangcheng);
        if (affectedRows>0) {
            mv.setViewName("redirect:/admin/jiangcheng");
        }else {
            System.out.println("失败");

        }
        return mv;
    }


}