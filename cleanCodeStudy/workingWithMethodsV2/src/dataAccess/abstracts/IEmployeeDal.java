package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Employee;

public interface IEmployeeDal {
	void add(Employee employee);
	List<Employee> getAll();
	
}
