package net.javaguides.springbootdockerdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceStub {
	private static Map<Long,Employee>employees=new HashMap<>();
	private static Long index=3L;
	static {
		Employee employee1 = new Employee(1L,"sush","9999999999",200000L);
		Employee employee2 = new Employee(2L,"prasad","8888888888",500000L);
		Employee employee3 = new Employee(3L,"sumit","7777777777",600000L);
		employees.put(1L, employee1);
		employees.put(2L, employee2);
		employees.put(3L, employee3);
		
		
	}
	public static List<Employee>getAllEmployees(){
		return new ArrayList<>(employees.values());
	}
	public static Employee getEmployeeDetails(Long employeeId) {
		return employees.get(employeeId);
	}
	public static Employee addEmployee(Employee employee) {
		index+=1;
		employee.setId(index);
		employees.put(index, employee);
		return employee;
	}
	public static Employee updateEmployee(Long employeeId,Employee employee) {
		employee.setId(employeeId);
		employees.put(employeeId,employee);
		return employee;
	}
	

}
