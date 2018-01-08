package com.ty.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.Allinterface.IAccountService;
import com.ty.account.bean.User;
import com.ty.account.dao.AccountDao;
import com.ty.jsonBean.SuccessResponse;
import com.ty.utills.IdUtills;

@Service
public class AccountService implements IAccountService{
	
	@Autowired
	public AccountDao accountDao;
	
	@Override
	public SuccessResponse registerAccount(User user){
		SuccessResponse response = new SuccessResponse();
		user.userID = IdUtills.getUUID();
		if(!accountDao.isExist(user.accountName)){
			//user生成唯一的uid
			user.userID = IdUtills.getUUID();
			if(accountDao.registerAccount(user)==1){
				response.success=true;
				response.reason="注册成功";
			}
			else{
				response.success=false;
				response.reason="数据库插入失败";
			}
		}else {
			response.reason="用户名已经存在";
			response.success=false;
		}
		return response;
	}
	//后期需要实现单点登录的逻辑代码
	//实现单点登录便于后期的分布式开发
	public SuccessResponse loginAccount(User user){
		SuccessResponse successResponse = new SuccessResponse();
		if(accountDao.isExist(user.accountName)){
			if(accountDao.loginAccount(user)){
				successResponse.success=true;
				successResponse.reason="登录成功";
				//单点登录的时候这里需要缓存设计
				System.out.println("单点登录设计尚未完成");
			}
			else {
				successResponse.success=false;
				successResponse.reason="账户名密码错误";
			}
		}else{
			successResponse.success=false;
			successResponse.reason="账户名不存在";
		}
		return successResponse;
	}
}