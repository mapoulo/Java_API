package com.example.demo.employeeList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/employees")
	public List<Employee> getEmployees() {
		return service.getList();
	}
	
	@RequestMapping("/employees/{id}")
	public Employee getEmplueeById(@PathVariable String id) {
		return service.getList(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody Employee employee) {
		service.addemployee(employee);
	}
	
	 @RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
		public void updateEmployee(@RequestBody Employee employee,@PathVariable String id ) {
		 service.update(employee, id);
		}
	 
	 
	 @RequestMapping(method=RequestMethod.DELETE, value="employees/{id}")
	    public void delete(@PathVariable String id) {
		 service.delete(id);
	    }
}
