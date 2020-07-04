package com.example.demo.employeeList;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeInterface extends CrudRepository<Employee, String> {

}
