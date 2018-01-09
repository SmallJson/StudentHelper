package com.ty.account.bean;

public class Account {
	public String userID;
	public String accountName;
	public String accountPassword;
	//用户登录的时候，可携带token
	public String token;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", accountName=" + accountName + ", accountPassword=" + accountPassword + "]";
	}
}
