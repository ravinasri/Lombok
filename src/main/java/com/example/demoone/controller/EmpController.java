package com.example.demoone.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoone.model.Employee;
import com.example.demoone.repository.EmpRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class EmpController {

	@Autowired
	EmpRepository empRepository;

	@GetMapping("/getAll")
	public List<Employee> getAll() {
		return empRepository.findAll();
	}

	@PostMapping("/login")
	public Employee create(@RequestBody Employee e) {
		return empRepository.save(e);
	}

	@GetMapping("/get/{id}")
	public Optional<Employee> getById(@PathVariable("id") int _id) {
		return empRepository.findById(_id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") int id) {
		empRepository.deleteById(id);
	}

	@DeleteMapping("/delete")
	public void deleteAll() {
		empRepository.deleteAll();
	}

	@PutMapping("/update/{id}")
	public Employee update(@RequestBody Employee e, @PathVariable("id") int id) {

		Optional<Employee> e1 = empRepository.findById(id);

	Employee e2=e1.get();
	e2.setPassword(e.getPassword());
//	Employee.builder().password(e.getPassword()).build();
	return empRepository.save(e2);

	}

}
