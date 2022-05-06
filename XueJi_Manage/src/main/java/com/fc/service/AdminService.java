package com.fc.service;

import com.fc.vo.ResultVo;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    ResultVo getList(Integer pageNum,Integer pageSize,Long userId);

    ResultVo login(String userName, String userPm);


}
