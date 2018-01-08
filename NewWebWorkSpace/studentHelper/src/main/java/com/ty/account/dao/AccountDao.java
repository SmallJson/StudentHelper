package com.ty.account.dao;

import org.apache.ibatis.builder.annotation.MapperAnnotationBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.Allinterface.IAccountDao;
import com.ty.account.bean.User;
import com.ty.mapper.AccountMapper;

@Repository
public class AccountDao implements IAccountDao{
	
	@Autowired
	AccountMapper mapper;
	@Override
	public boolean isExist(String accountName) {
		// TODO Auto-generated method stub
		if(mapper.queryAccount(accountName)>0){
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int registerAccount(User user) {
		// TODO Auto-generated method stub
		return mapper.insertAccount(user);
	}
	
	public boolean loginAccount(User user){
		if(mapper.queryAccountByNameAndPassword(user)==1){
			return true;
		}else {
			return false;
		}
	}
}