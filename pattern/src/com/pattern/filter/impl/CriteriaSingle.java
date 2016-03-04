/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.filter.impl;

import java.util.ArrayList;
import java.util.List;

import com.pattern.filter.Criteria;
import com.pattern.filter.Person;

public class CriteriaSingle implements Criteria {
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}
}
