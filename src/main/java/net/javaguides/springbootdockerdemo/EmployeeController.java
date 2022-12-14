package net.javaguides.springbootdockerdemo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
	@GetMapping("/employee")
	public List<Employee>getAllEmployees(){
		return EmployeeServiceStub.getAllEmployees();
	}
	
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployeeDetails(@PathVariable Long employeeId) {
		return EmployeeServiceStub.getEmployeeDetails(employeeId);
	}
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return EmployeeServiceStub.addEmployee(employee);
	}
	
	@PutMapping("/updateEmployee/{employeeId}")
	public Employee updateEmployee(@PathVariable Long employeeId,@RequestBody Employee employee) {
		return EmployeeServiceStub.updateEmployee(employeeId, employee);
	}

}
