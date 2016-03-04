/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.filter.impl;

import java.util.ArrayList;
import java.util.List;

import com.pattern.filter.Criteria;
import com.pattern.filter.Person;

public class CriteriaMale implements Criteria {
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}
