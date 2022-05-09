package com.fc.service.impl;

import org.springframework.stereotype.Service;

@Service
public class loginService {
    public String login(String userName,String userPw,int userType){
            System.out.println("userType"+userType);
		try
    {
        Thread.sleep(700);
    } catch (InterruptedException e)
    {
        e.printStackTrace();
    }
		String result="no";
		if (userType==0){//判定为管理员登录

        }

}
