package com.imooc.miaosha.access;

import com.imooc.miaosha.domain.MiaoshaUser;

public class UserContext {

	/**
	 * 多线程 /；/ 当前线程绑定，放在当前线程中的，每个线程中单独存一份
	 */
	private static ThreadLocal<MiaoshaUser> userHolder = new ThreadLocal<MiaoshaUser>();
	
	public static void setUser(MiaoshaUser user) {
		userHolder.set(user);
	}
	
	public static MiaoshaUser getUser() {
		return userHolder.get();
	}

}
