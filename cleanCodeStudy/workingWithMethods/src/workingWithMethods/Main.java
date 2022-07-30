package workingWithMethods;

public class Main {

	public static void main(String[] args) throws Exception {
		CustomerManager  customerManager = new CustomerManager();
		customerManager.add("Merve", "Demir", "222");
		
		customerManager.add1(new Customer(1,"Merve","Demir","222",6));
		customerManager.add1(new Customer(2, "Mediha", " ", "222",6));
		

	}

}



