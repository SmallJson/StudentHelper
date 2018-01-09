package com.ty.account.dao;

import org.apache.ibatis.builder.annotation.MapperAnnotationBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.Allinterface.IAccountDetailDao;
import com.ty.account.bean.AccountDetails;
import com.ty.mapper.AccountDetailMapper;

@Repository
public class AccountDetailDao implements IAccountDetailDao {
	@Autowired
	public AccountDetailMapper acccountDetailMapper;
	
	@Override
	public boolean registerAccountDetail(AccountDetails details) {
		// TODO Auto-generated method stub
		return acccountDetailMapper.insertAccountDetail(details)==1?true:false;
	}
}