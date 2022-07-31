package entities.concretes;

public class Employee extends Person{
	private double salary;

	
	
	public Employee() {
		super();
	}

	public Employee(double salary,int id, String nationalIdentity, String fistName, String lastName, int yearOfBirth) {
		super(id, nationalIdentity, fistName, lastName, yearOfBirth);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
