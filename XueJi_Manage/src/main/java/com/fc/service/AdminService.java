package com.fc.service;

import com.fc.entity.TAdmin;
import com.fc.vo.ResultVO;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    ResultVO login(String userName, String userPm);


    String update(TAdmin admin);
}
