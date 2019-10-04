package com.example.spring_batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.example.spring_batch.model.Employee;

public class EmployeeFieldSetMapper implements FieldSetMapper<Employee> {

	public Employee mapFieldSet(FieldSet fieldSet) throws BindException {
		
		Employee emp = new Employee();
		emp.setEmployeeName(fieldSet.readString(0));
		emp.setEmployeeId(fieldSet.readString(1));
		return emp;
	}

}
