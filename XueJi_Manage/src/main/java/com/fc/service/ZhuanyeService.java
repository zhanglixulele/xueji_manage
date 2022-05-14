package com.fc.service;

import com.fc.entity.TZhuanye;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface ZhuanyeService {


    List<TZhuanye> getlist();


    ModelAndView zhuanyeDel(int id);

    ModelAndView zhuanyeAdd(TZhuanye tZhuanye);
}
