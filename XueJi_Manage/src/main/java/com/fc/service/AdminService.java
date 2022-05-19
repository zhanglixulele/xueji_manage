package com.fc.service;

import com.fc.entity.TAdmin;
import com.fc.vo.ResultVO;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public interface AdminService {

    ResultVO login(String userName, String userPm);

    String update(TAdmin admin, HttpSession session,
                  HttpServletRequest request);
}
