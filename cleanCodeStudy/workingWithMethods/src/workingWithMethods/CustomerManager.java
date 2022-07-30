package workingWithMethods;

public class CustomerManager {
	//field eklemek istersek bu metodu kulland���m�z sayfalarda bozulma olur
	public void add(String firstName, String lastName, String identityNumber) {
		
	}
	
	//defensive coding i�in nesne g�ndermek daha do�ru kullan�m
	public void add1(Customer customer) throws Exception  {
		
		//code smell
		//technical debt :  sonradan d�zeltmek �zere kod yaz�m�
		//if blo�unu burada tutmak yerine metod yap�p �a�r�r�z.
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		validateIdentityNumberIfEmpty(customer);
		
		
		CustomerDal customerDal = new CustomerDal();
		checkCustomerExists(customer);
		customerDal.add(customer);
	}
	// motod yazarak teknik bor�lanmay� refactor etmeyi kolayla�t�r�yoruz.
	
	private void validateFirstNameIfEmpty(Customer customer) {
		if(!customer.getFirstName().trim().isEmpty()) {
			
			System.out.println("M��teri ismi eklendi");
		}else {
			System.out.println("�sim k�sm� bo� ge�ilemez!");
		}
	}
	private void validateLastNameIfEmpty(Customer customer) {
		if(!customer.getLastName().trim().isEmpty()) {
			
			System.out.println("M��teri soyismi klendi");
		}else {
			System.out.println("Soyisim k�sm� bo� ge�ilemez!");
		}
		
	}
		private void validateIdentityNumberIfEmpty(Customer customer) {
			if(!customer.getIdentityNumber().trim().isEmpty()) {
				
				System.out.println("M��teri kimlik no eklendi");
			}else {
				System.out.println("Kimlik No k�sm� bo� ge�ilemez!");
			}
		}
		
		public void validateFirstNameLength(Customer customer) throws Exception {
			if(customer.getFirstName().length()<2) {
				throw new Exception("Do�rulama hatas�!");
			}
		}
	
	public void addByOtherBusiness(Customer customer) throws Exception {
		
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		validateFirstNameLength(customer);
		///////////////////////////////////////////////////
		CustomerDal customerDal = new CustomerDal();
		checkCustomerExists(customer);
		customerDal.add(customer);
		
		
		
	}
	
	private void checkCustomerExists(Customer customer) throws Exception {
		CustomerDal customerDal = new CustomerDal();
		if(customerDal.customerExists(customer)) {
			throw new Exception("M��teri zaten mevcut.");
		}
	}
}
