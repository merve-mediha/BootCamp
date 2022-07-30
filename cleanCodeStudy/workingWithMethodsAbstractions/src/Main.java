

public class Main {

	public static void main(String[] args) throws Exception {
		CustomerManager  customerManager = new CustomerManager(new EfCustomerDal());
		
		
		customerManager.add(new Customer(1,"Merve","Demir","222",6));
		customerManager.add(new Customer(2, "Mediha", "Demir", "222",6));
		

	}

}



