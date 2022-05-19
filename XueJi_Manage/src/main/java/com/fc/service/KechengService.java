package com.fc.service;

import com.fc.entity.TKecheng;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface KechengService {
    List<TKecheng> getAll();

    ModelAndView kechengDel(int id);

    ModelAndView kechengAdd(TKecheng kecheng);
}
