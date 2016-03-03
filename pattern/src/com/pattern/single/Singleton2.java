/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.single;

/**
 * 懒汉式，线程安全
 * @author: gao peng
 * @date:   2016年3月3日 上午11:34:11   
 *
 */
public class Singleton2 {
	private static Singleton2 instance;

	private Singleton2 (){}

	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
