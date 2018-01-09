package com.ty.jsonBean;

//注册用户相应的json实体
public class SuccessResponse {
	public boolean success;
	public String reason;
	//登录成功的时候，携带token。
	public String token;
	@Override
	public String toString() {
		return "SuccessResponse [success=" + success + ", reason=" + reason + ", token=" + token + "]";
	}

}
