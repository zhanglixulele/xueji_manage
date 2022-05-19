package com.fc.service;

import com.fc.entity.TStu;
import com.fc.vo.ResultVO;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface StuService {

    List<TStu> getAll();

    ModelAndView stuDel(int id);

    ModelAndView add(TStu stu);

     ModelAndView stuUpdate(TStu stu);
}
