package com.ty.utills;

import java.util.*;

import com.ty.Allinterface.IRedisUtills;
import com.ty.account.bean.Account;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
//在程序设计中，不要使用字面常量
//单机版的redisClient
public class RedisClient implements IRedisUtills{
	public JedisPool jedisPool;
	public JedisPool getJedisPool() {
		return jedisPool;
	}
	public void setJedisPool(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}
	@Override
	public void setAccount(String key, Account user) {
		// TODO Auto-generated method stub
		Jedis jedis = jedisPool.getResource();
		HashMap<String, String> map = new HashMap<String,String>();
		map.put(RedisKey.USER_NAME_IN_REDIS, user.accountName);
		map.put(RedisKey.USER_PASSWORD_IN_REDIS,user.accountPassword);
		jedis.hmset(key, map);
	}
	@Override
	public Account getAccount(String key) {
		// TODO Auto-generated method stub
		Jedis jedis = jedisPool.getResource();
		List<String> list = jedis.hmget(key,RedisKey.USER_NAME_IN_REDIS,RedisKey.USER_PASSWORD_IN_REDIS);
		Account user=null;
		if(list.get(0)!=null&&list.get(1)!=null){
			user = new Account();
			user.accountName = list.get(0);
			user.accountPassword =list.get(1);
		}
		return user;
	}
	//设置键的过期时间
	@Override
	public void setExpire(String key, int time) {
		// TODO Auto-generated method stub
		Jedis jedis = jedisPool.getResource();
		jedis.expire(key, time);
	}
}
