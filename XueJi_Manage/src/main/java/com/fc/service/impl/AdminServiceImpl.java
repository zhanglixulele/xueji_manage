package com.fc.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fc.dao.TAdminMapper;
import com.fc.entity.TAdmin;
import com.fc.entity.TAdminExample;
import com.fc.service.AdminService;
import com.fc.vo.DataVO;
import com.fc.vo.ResultVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private TAdminMapper adminMapper;

    @Override
    public ResultVo getList(Integer pageNum, Integer pageSize, Long userId) {
        //返回给前端的结果
        ResultVo resultVo;

        DataVO<TAdmin> adminDataVO;

        List<TAdmin> tAdmins;

        if (userId!=null){
            tAdmins = new ArrayList<>();

            TAdmin admin = adminMapper.selectByPrimaryKey(userId);

            if (admin==null){
                adminDataVO=new DataVO<>(0L,tAdmins,pageNum,pageSize);
                resultVo=new ResultVo(4000,"查无此管理员",false,adminDataVO);
            }else {
                tAdmins.add(admin);

                adminDataVO = new DataVO<>(1L, tAdmins, pageNum, pageSize);

                resultVo = new ResultVo(1000, "查到了该管理员!", true, adminDataVO);
            }
        }else {
            PageHelper.startPage(pageNum, pageSize);

            tAdmins = adminMapper.selectByExample(null);

            if (tAdmins.size() == 0) {
                adminDataVO = new DataVO<>(0L, tAdmins, pageNum, pageSize);

                resultVo = new ResultVo(4100, "没有管理员!!!", false, adminDataVO);
        }else {
                PageInfo<TAdmin> pageInfo = new PageInfo<>(tAdmins);

                adminDataVO = new DataVO<>(pageInfo.getTotal(), tAdmins, pageNum, pageSize);

                resultVo = new ResultVo(1100, "管理员查询成功！！！!", true, adminDataVO);

            }
            }

        return resultVo;
    }

    @Override
    public ResultVo login(String userName, String userPm) {
        ResultVo vo = new ResultVo();

        vo.setCode(-1);
        vo.setMessage("登录失败，当前用户名不存在");
        vo.setSuccess(false);
        vo.setData(null);

        TAdminExample example = new TAdminExample();

        TAdminExample.Criteria criteria = example.createCriteria();

        criteria.andUsernameEqualTo(userName);

        List<TAdmin> admins = adminMapper.selectByExample(example);

        // 能查出来说明用户名是存在的
        if (admins.size() > 0) {
            TAdmin admin = admins.get(0);

            // 如果密码相同
            if (admin.getUserpw().equals(userPm)) {
                vo.setSuccess(true);
                vo.setMessage("登录成功！");
                vo.setCode(200);

                // 密码不要传给前端
                admin.setUserpw(null);

                String salt = String.valueOf((int) ((Math.random() * 9 + 1) * 100000));

                // 头部
                Map<String, Object> headers = new HashMap<>();

                headers.put("alg", "HS256");
                headers.put("typ", "JWT");

                // 获取token
                String token = JWT.create()
                        .withHeader(headers)
                        .withSubject("登录权限验证")
                        .withIssuer("admin")
                        .withIssuedAt(new Date())
                        .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 30))
                        .withClaim("id", admin.getUserid())
                        .withClaim("username", userName)
                        .withClaim("salt", salt)
                        .sign(Algorithm.HMAC256(salt));

                Map<String, Object> result = new HashMap<>();

                result.put("admin", admin);
                result.put("token", token);

                vo.setData(result);
            } else {
                vo.setCode(-2);
                vo.setMessage("登录失败，请输入正确的密码");
            }
        }

        return vo;
    }
}

