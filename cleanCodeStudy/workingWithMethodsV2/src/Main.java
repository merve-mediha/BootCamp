import java.util.List;

import business.abstracts.IEmployeeService;
import business.abstracts.IProductService;
import business.conctretes.CustomerManager;
import business.conctretes.EmployeeManager;
import business.conctretes.ProductManager;
import core.adapters.KpsServiceAdapter;
import dataAccess.concretes.entityFramework.EfCustomerDal;
import dataAccess.concretes.entityFramework.EfEmployeeDal;
import dataAccess.concretes.entityFramework.EfProductDal;
import entities.concretes.Customer;
import entities.concretes.Employee;
import entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
	
		IProductService productService = new ProductManager(new EfProductDal());
		
		List<Product> products = productService.getAll();
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		customerDemo();
	}
	
	
	
	private static void employeeDemo() {
		IEmployeeService employeeService = new EmployeeManager(new EfEmployeeDal());
		List<Employee> employees = employeeService.getAll();
		
		for (Employee employee : employees) {
			System.out.println(employee.getFistName());
		}
	}
	
	private static void customerDemo() {
		CustomerManager customerManager = new CustomerManager(new EfCustomerDal(), new KpsServiceAdapter() );

		Customer customer = new Customer(2, 1,"14662","Merve","Demiraslan",1997);
		

	System.out.println(customer.getFistName()+" "+ customer.getLastName());
		
	}

}
