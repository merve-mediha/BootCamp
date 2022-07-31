package business.conctretes;

import java.util.List;

import business.abstracts.IEmployeeService;
import dataAccess.abstracts.IEmployeeDal;
import entities.concretes.Employee;

public class EmployeeManager implements IEmployeeService{
	IEmployeeDal employeeDal;
	
	public EmployeeManager(IEmployeeDal employeeDal) {
		this.employeeDal = employeeDal;
	}

	@Override
	public List<Employee> getAll() {
		return employeeDal.getAll();
	}
	
	
	
}
