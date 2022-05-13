package com.fc.service.impl;

import com.fc.dao.TAdminMapper;
import com.fc.entity.TAdmin;
import com.fc.entity.TAdminExample;
import com.fc.service.AdminService;
import com.fc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private TAdminMapper adminDao;
    @Override
    public ResultVO login(String userName, String userPw) {
        ResultVO vo;
        TAdminExample example = new TAdminExample();

        TAdminExample.Criteria criteria = example.createCriteria();

        criteria.andUsernameEqualTo(userName);
        criteria.andUserpwEqualTo(userPw);

        List<TAdmin> admins = adminDao.selectByExample(example);

        if (admins.size()>0){
             vo = new ResultVO(200, "login success!!!", true, "yes");
        }else {
             vo = new ResultVO(0, "登录失败，用户名或密码错误", false, "no");
        }

        return vo;
    }
}

