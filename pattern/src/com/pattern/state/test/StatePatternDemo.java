/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.state.test;

import com.pattern.state.Context;
import com.pattern.state.impl.StartState;
import com.pattern.state.impl.StopState;

public class StatePatternDemo {
	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}
}
