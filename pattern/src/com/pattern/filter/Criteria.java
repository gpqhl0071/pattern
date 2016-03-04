/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.filter;

import java.util.List;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
