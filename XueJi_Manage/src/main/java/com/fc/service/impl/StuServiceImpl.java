package com.fc.service.impl;

import com.fc.dao.TStuMapper;
import com.fc.entity.TKecheng;
import com.fc.entity.TStu;
import com.fc.service.StuService;
import com.fc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private TStuMapper stuDao;
    @Override
    public List<TStu> getAll() {
        return stuDao.selectByExample(null);
    }

    @Override
    public ModelAndView stuDel(int id) {
        int i = stuDao.deleteByPrimaryKey(id);
        ModelAndView mv = new ModelAndView();
        if (i>0){
            mv.setViewName("redirect:/admin/stu");
        }else {
            mv.setViewName("失败");
        }
        return mv;
    }

    @Override
    public ModelAndView add(TStu stu) {
        int i =stuDao.insertSelective(stu);
        ModelAndView mv = new ModelAndView();
        if (i>0){
            mv.setViewName("redirect:/admin/stu");
        }else {
            mv.setViewName("失败");
        }
        return mv;
    }

    @Override
    public ModelAndView stuUpdate(TStu stu) {
        int i =stuDao.updateByPrimaryKeySelective(stu);
        ModelAndView mv = new ModelAndView();
        if (i>0){
            mv.setViewName("redirect:/admin/stu");
        }else {
            mv.setViewName("失败");
        }
        return mv;
    }

}
