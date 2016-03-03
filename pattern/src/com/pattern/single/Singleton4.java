/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.single;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @author: gao peng
 * @date:   2016年3月3日 上午11:35:21   
 *
 */
public class Singleton4 {
	private volatile static Singleton4 Singleton4;

	private Singleton4() {
	}

	public static Singleton4 getSingleton4() {
		if (Singleton4 == null) {
			synchronized (Singleton4.class) {
				if (Singleton4 == null) {
					Singleton4 = new Singleton4();
				}
			}
		}
		return Singleton4;
	}
}
