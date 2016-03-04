/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.single;

/**
 * 饿汉式
 * @author: gao peng
 * @date:   2016年3月3日 上午11:34:39   
 *
 */
public class Singleton3 {
	private static Singleton3 instance = new Singleton3();

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		return instance;
	}
}
