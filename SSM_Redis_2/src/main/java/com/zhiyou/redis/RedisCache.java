package com.zhiyou.redis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;

import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration	//说明这个类是配置文件
@EnableCaching //开启缓存的管理
public class RedisCache extends CachingConfigurerSupport{
	/*
	 * volatile:(弱同步机制) 关键字之一被其修饰的变量发生改变的时候会通知其他线程(当有线程改变对象的值,所有其他线程都会接到通知)
	 * */
	
	@Autowired
	private volatile JedisConnectionFactory jedisConnectionFactory;
	@Autowired
	private volatile RedisTemplate<String,String> redisTemplate;
	@Autowired
	private volatile RedisCacheManager redisCacheManager;
	
	public RedisCache(JedisConnectionFactory jedisConnectionFactory,RedisTemplate<String,String> redisTemplate,RedisCacheManager redisCacheManager){
		this.jedisConnectionFactory = jedisConnectionFactory;
		this.redisCacheManager = redisCacheManager;
		this.redisTemplate = redisTemplate;
	}

	private JedisConnectionFactory getJedisConnectionFactory() {
		return jedisConnectionFactory;
	}

	

	private RedisTemplate<String, String> getRedisTemplate() {
		return redisTemplate;
	}

	

	private RedisCacheManager getRedisCacheManager() {
		return redisCacheManager;
	}

	
}
