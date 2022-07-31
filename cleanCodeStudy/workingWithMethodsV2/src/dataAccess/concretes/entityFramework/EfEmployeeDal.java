package dataAccess.concretes.entityFramework;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.IEmployeeDal;
import entities.concretes.Employee;

public class EfEmployeeDal implements IEmployeeDal {

	@Override
	public void add(Employee employee) {
		System.out.println("�al��an Entity Framework ile veritaban�na eklendi");
		
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(5500,1,"1456","Ali","Demir",1993));
		employees.add(new Employee(7500,1,"1486","Ay�e"," ",1993));
		return employees;
	}

}
