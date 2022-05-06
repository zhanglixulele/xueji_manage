package com.fc.service.impl;

import com.fc.dao.TAdminMapper;
import com.fc.entity.TAdmin;
import com.fc.entity.TAdminExample;
import com.fc.service.AdminService;
import com.fc.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private TAdminMapper adminDao;


    @Override
    public ResultVo login(String username, String userpw) {
        ResultVo vo = new ResultVo();

        TAdminExample example = new TAdminExample();

        TAdminExample.Criteria criteria = example.createCriteria();

        //判断输入的用户名密码和数据库里的姓名密码是否相同
        criteria.andUsernameEqualTo(username);
        criteria.andUserpwEqualTo(userpw);

        List<TAdmin> admins = adminDao.selectByExample(example);

        if (admins.size()>0){
            vo.setData(admins.get(0));
            vo.setSuccess(true);
            vo.setMessage("login success!");
            vo.setCode(200);
        }else {
            vo.setMessage("登录失败，用户名或密码错误，请重试密码！");
            vo.setCode(0);
        }

        return vo;
    }
}
