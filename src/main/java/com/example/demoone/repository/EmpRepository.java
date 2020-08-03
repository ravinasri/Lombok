package com.example.demoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoone.model.Employee;

public interface EmpRepository extends JpaRepository<Employee,Integer> {

}
