package com.ty.mapper;

import com.ty.account.bean.Account;
import com.ty.account.bean.AccountDetails;

public interface AccountMapper {
	public int queryAccount(String accountName);
	public int insertAccount(Account user);
	public int queryAccountByNameAndPassword(Account user);
	public int updateAccoutByName(AccountDetails userDetails);
}
