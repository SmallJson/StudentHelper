package com.ty.account.bean;

public class AccountDetails {
	
	//UserDetails的唯一性标识
	public String userDetailID;
	
	public String getUserDetailID() {
		return userDetailID;
	}
	public void setUserDetailID(String userDetailID) {
		userDetailID = userDetailID;
	}
	//用户账户信息
	public String accountName;
	public String accountPassword;
	public String token;                                                                                                                                                                                                                                                                           
	//用户详细信息
	public String detailName;
	public String detailImage;
	public String detailMail;
	public String detailWord;
	
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
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getDetailName() {
		return detailName;
	}
	public void setDetailName(String detailName) {
		this.detailName = detailName;
	}
	public String getDetailImage() {
		return detailImage;
	}
	public void setDetailImage(String detailImage) {
		this.detailImage = detailImage;
	}
	public String getDetailMail() {
		return detailMail;
	}
	public void setDetailMail(String detailMail) {
		this.detailMail = detailMail;
	}
	public String getDetailWord() {
		return detailWord;
	}
	public void setDetailWord(String detailWord) {
		this.detailWord = detailWord;
	}
}
