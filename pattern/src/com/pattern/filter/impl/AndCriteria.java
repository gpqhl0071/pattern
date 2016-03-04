/*
*Copyright (c) 2016, gp.inc and/or its affiliates. All rights reserved.
*/
package com.pattern.filter.impl;

import java.util.List;

import com.pattern.filter.Criteria;
import com.pattern.filter.Person;

public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}
}
