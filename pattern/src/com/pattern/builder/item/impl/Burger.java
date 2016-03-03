/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.builder.item.impl;

import com.pattern.builder.Item;
import com.pattern.builder.Packing;
import com.pattern.builder.packing.impl.Wrapper;

public abstract class Burger implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
