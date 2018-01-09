package com.ty.Allinterface;

import com.ty.account.bean.Account;
import com.ty.account.bean.AccountDetails;
import com.ty.jsonBean.SuccessResponse;

public interface IAccountService {
	public SuccessResponse registerAccount(Account user);
	public SuccessResponse loginAccount(Account user);
	public boolean isLogin(String token);
	//完善用户信息
	public SuccessResponse registerAccountDetails(AccountDetails userDetails)  throws Exception ;
}
