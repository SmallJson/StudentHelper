package com.ty.Allinterface;

import com.ty.account.bean.Account;
import com.ty.account.bean.AccountDetails;

public interface IAccountDao {
	//查询账户是否存在
	public boolean isExist(String accountName);
	public int registerAccount(Account user);
	public boolean loginAccount(Account user);
	public boolean registerAccountDetail(AccountDetails details);
}
