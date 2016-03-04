/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.single;

/**
 * 登记式/静态内部类
 * @author: gao peng
 * @date:   2016年3月3日 上午11:36:20   
 *
 */
public class Singleton5 {
	private static class Singleton5Holder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}

	private Singleton5() {
	}

	public static final Singleton5 getInstance() {
		return Singleton5Holder.INSTANCE;
	}
}
