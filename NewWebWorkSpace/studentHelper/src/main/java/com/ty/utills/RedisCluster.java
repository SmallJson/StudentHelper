package com.ty.utills;

import com.ty.Allinterface.IRedisUtills;
import com.ty.account.bean.Account;

//集群版的redisClient
public class RedisCluster implements IRedisUtills{
	
	@Override
	public void setAccount(String key, Account user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account getAccount(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setExpire(String key, int time) {
		// TODO Auto-generated method stub
		
	}
	
}
