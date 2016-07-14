package com.code.util.redis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.code.entity.user.WebUser;
import com.code.tool.RedisKeyUtil;

@Service
public class RedisService {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private RedisTemplate<String,WebUser> redisTemplate;
	@Autowired
	private RedisTemplate<String,String> redisTemplateString;

	/**
	 * 压值
	 * @param user
	 * @return
	 */
	public String setWebUser(WebUser user){
		if(null!=user){
			String key = RedisKeyUtil.getUUID(user.getId());
			redisTemplate.opsForValue().set(key, user);
			return key;
		}
		return "";
	}

	/**
	 * 用token取用户
	 * @param key
	 * @return
	 */
	public WebUser getWebUser(String key){
		return redisTemplate.opsForValue().get(key);
	}

	/**
	 * 清空token值
	 * @param key
	 */
	public void clearWebUser(String key){
		redisTemplate.opsForValue().set(key,null);
	}
	
	/**
	 * 存放字符串
	 * @param key
	 * @param value
	 */
	public void put(String key,String value){
		redisTemplateString.opsForValue().set(key, value);
	}
	
	/**
	 * 取出字符串
	 * @param key
	 * @param value
	 */
	public String get(String key){
		return redisTemplateString.opsForValue().get(key);
	}
}
