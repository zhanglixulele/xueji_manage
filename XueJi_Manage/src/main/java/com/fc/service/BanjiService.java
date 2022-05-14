package com.fc.service;

import com.fc.entity.TBanji;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface BanjiService {
    List<TBanji> getlist();

    ModelAndView banjiDel(int id);

    ModelAndView banjiAdd(TBanji tBanji);
}
