package com.util.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * 
 * @author Jie
 *
 */
public  final class RedisAPI {

	private JedisPool jedisPoll;

	/**
	 * 关闭资源
	 * 
	 * @param jedis
	 * @param jedisPoll
	 */
	public static void returnResource(Jedis jedis, JedisPool jedisPoll) {
		if (jedis != null) {
			jedis.close();
		}
		if (jedisPoll != null) {
			jedisPoll.close();
		}
	}

	/**
	 * 通过键获取值
	 * 
	 * @param key
	 * @return
	 */
	public String get(String key) {
		String value = null;
		Jedis jedis = null;
		try {
			jedis = jedisPoll.getResource();
			value = jedis.get(key);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("RedisAPI中的get方法出错");
		} finally {
			returnResource(jedis, jedisPoll);
		}
		return value;
	}

	/**
	 * 根据key判断是否存在
	 * 
	 * @param key
	 * @return
	 */
	public boolean exist(String key) {
		Jedis jedis = null;
		try {
			jedis = jedisPoll.getResource();
			return jedis.exists(key);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("RedisAPI中的exist方法出错");
		} finally {
			returnResource(jedis, jedisPoll);
		}
		return false;
	}

	public boolean set(String key, String value) {
		Jedis jedis = null;
		try {
			jedis = jedisPoll.getResource();
			jedis.set(key, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("RedisAPI中的set方法出错");
		} finally {
			returnResource(jedis, jedisPoll);
		}
		return false;
	}

	/**
	 * getter
	 * 
	 * @return
	 */
	public JedisPool getJedisPoll() {
		return jedisPoll;
	}

	/**
	 * setter
	 * 
	 * @param jedisPoll
	 */
	public void setJedisPoll(JedisPool jedisPoll) {
		this.jedisPoll = jedisPoll;
	}

}
