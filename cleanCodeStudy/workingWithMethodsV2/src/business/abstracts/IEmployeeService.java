package business.abstracts;

import java.util.List;

import entities.concretes.Employee;

public interface IEmployeeService {
	List<Employee> getAll();
}
