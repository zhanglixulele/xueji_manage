package com.fc.service;


import com.fc.entity.TJiangcheng;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


public interface JiangChengService {

    List<TJiangcheng> getAll();

    ModelAndView jiangchengDel(int id);

    ModelAndView add(TJiangcheng jiangcheng);
}
