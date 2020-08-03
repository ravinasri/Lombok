package com.example.demoone.modelmapper;

import org.modelmapper.ModelMapper;

import com.example.demoone.model.Employee;
import com.example.demoone.model.EmployeeDto;


public class ModelMapperApplication {
	
	public static void main(String args[])
	{
		Employee source=new Employee(1,"ravina");
		EmployeeDto target=new EmployeeDto();
		ModelMapper model=new ModelMapper();
		model.map(source,target);
		System.out.println(target.getPassword());
		
		
	}

}
