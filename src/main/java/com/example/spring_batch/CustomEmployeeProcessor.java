package com.example.spring_batch;

import org.springframework.batch.item.ItemProcessor;

import com.example.spring_batch.model.Employee;

public class CustomEmployeeProcessor implements ItemProcessor<Employee, Employee>{

	public Employee process(Employee emp) throws Exception {
		
		System.out.println("Processing "+ emp);
		System.out.println("Processing "+ emp.getEmployeeName());
		
		
		return emp;
	}

}
