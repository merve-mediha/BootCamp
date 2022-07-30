

public class CustomerManager {
	private CustomerDal customerDal;
	//dependency injection
	
	public CustomerManager(CustomerDal customerDal) { 
		super();
		this.customerDal = customerDal;
	}

	public void add(Customer customer)  {
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		validateIdentityNumberIfEmpty(customer);
		
		
		
		checkCustomerExists(customer);
		customerDal.add(customer);
	}
	
	private void validateFirstNameIfEmpty(Customer customer) {
		if(customer.getFirstName().trim().isEmpty()) {
			
			System.out.println("Ýsim boþ olamaz");
		}
	}
	private void validateLastNameIfEmpty(Customer customer)  {
		if(customer.getLastName().trim().isEmpty()) {
			
		System.out.println("Soyisim boþ olmaz");
		
		}
		
	}
		private void validateIdentityNumberIfEmpty(Customer customer) {
			if(customer.getIdentityNumber().trim().isEmpty()) {
				
				System.out.println("Kimlik no boþ olmaz");
			}
		}
		
		
	
	
	private void checkCustomerExists(Customer customer) {
		
		if(customerDal.customerExists(customer)) {
			System.out.println("Müþteri zaten mevcut.");
		}
	}
}
