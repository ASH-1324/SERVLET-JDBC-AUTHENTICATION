package com.ash.authentication.beans;

import lombok.Builder;

@Builder
public class Employee {
	private int id;
	private String name;

	public static void main(String[] args) {
		Employee employee = Employee.builder().id(101).name("Ashraf").build();

		System.out.println(employee.id);
		System.out.println(employee.name);

	}
}
