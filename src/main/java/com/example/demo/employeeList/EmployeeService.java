package com.example.demo.employeeList;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

	@Autowired
	EmployeeInterface crudRepo;
	
	public List<Employee>  getList(){
		//return employees;
		List<Employee> employees = new ArrayList<>();
		crudRepo.findAll().forEach(employees::add);
		return employees;
	}
	
	public Employee getList(String id) {
		return crudRepo.findById(id).get();
	}
	
	public void addemployee(Employee employee) {
		crudRepo.save(employee);
	}

	public void update(Employee employee, String id) {
			
		crudRepo.save(employee);
	}

	public void delete(String id) {
		crudRepo.deleteById(id);
	}

	
}
