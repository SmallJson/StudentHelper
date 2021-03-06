package com.ty.account.dao;

import org.apache.ibatis.builder.annotation.MapperAnnotationBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.Allinterface.IAccountDao;
import com.ty.account.bean.Account;
import com.ty.account.bean.AccountDetails;
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
	public int registerAccount(Account user) {
		// TODO Auto-generated method stub
		return mapper.insertAccount(user);
	}
	@Override
	public boolean loginAccount(Account user){
		if(mapper.queryAccountByNameAndPassword(user)==1){
			return true;
		}else {
			return false;
		}
	}
	@Override
	public boolean registerAccountDetail(AccountDetails details) {
		// TODO Auto-generated method stub
		int rows = mapper.updateAccoutByName(details);
		return rows==1?true:false;
	}

}
