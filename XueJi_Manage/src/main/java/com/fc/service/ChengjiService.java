package com.fc.service;

import com.fc.entity.TChengji;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface ChengjiService {
    List<TChengji> getAll();

    ModelAndView chengjiDel(int id);


    ModelAndView add(TChengji chengji);
}
