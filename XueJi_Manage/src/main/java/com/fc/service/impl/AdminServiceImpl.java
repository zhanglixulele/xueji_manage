package com.fc.service.impl;

import com.fc.dao.TAdminMapper;
import com.fc.entity.TAdmin;
import com.fc.entity.TAdminExample;
import com.fc.service.AdminService;
import com.fc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
        System.out.println(admins.size());
        if (admins.size() > 0) {
            vo = new ResultVO(200, "login success!!!", true, "yes");
        } else {
            vo = new ResultVO(0, "登录失败，用户名或密码错误", false, "no");
        }

        return vo;
    }



    @Override
    public String update(TAdmin admin, HttpSession session,
                         HttpServletRequest request) {
        System.out.println("start .....");
        System.out.println(admin);
        // Integer id = admin.getUserid();

        TAdmin result = adminDao.selectByPrimaryName(admin.getUsername());
        admin.setUserid(result.getUserid());
        //获取数据库里管理员密码
        String userpw = request.getParameter("userpw");
        System.out.println(userpw);
        //从页面中获取新密码
        String userpw1 = request.getParameter("userpw1");
        System.out.println(userpw1);
        if (result != null&&userpw.equals(result.getUserpw())) {
            System.out.println(result.getUserpw());
            System.out.println("find success .....");
            admin.setUserpw(userpw1);
            //没有执行更新语句
            adminDao.updateByPrimaryKey(admin);

            System.out.println(admin.getUserpw());

            session.setAttribute("sessionScope", admin);

            return "修改成功";
        } else {

            System.out.println("find exit .....");
            return "修改失败";
        }
    }

}

