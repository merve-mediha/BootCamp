package workingWithMethods;

public class CustomerManager {
	//field eklemek istersek bu metodu kullandýðýmýz sayfalarda bozulma olur
	public void add(String firstName, String lastName, String identityNumber) {
		
	}
	
	//defensive coding için nesne göndermek daha doðru kullaným
	public void add1(Customer customer) throws Exception  {
		
		//code smell
		//technical debt :  sonradan düzeltmek üzere kod yazýmý
		//if bloðunu burada tutmak yerine metod yapýp çaðrýrýz.
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		validateIdentityNumberIfEmpty(customer);
		
		
		CustomerDal customerDal = new CustomerDal();
		checkCustomerExists(customer);
		customerDal.add(customer);
	}
	// motod yazarak teknik borçlanmayý refactor etmeyi kolaylaþtýrýyoruz.
	
	private void validateFirstNameIfEmpty(Customer customer) {
		if(!customer.getFirstName().trim().isEmpty()) {
			
			System.out.println("Müþteri ismi eklendi");
		}else {
			System.out.println("Ýsim kýsmý boþ geçilemez!");
		}
	}
	private void validateLastNameIfEmpty(Customer customer) {
		if(!customer.getLastName().trim().isEmpty()) {
			
			System.out.println("Müþteri soyismi klendi");
		}else {
			System.out.println("Soyisim kýsmý boþ geçilemez!");
		}
		
	}
		private void validateIdentityNumberIfEmpty(Customer customer) {
			if(!customer.getIdentityNumber().trim().isEmpty()) {
				
				System.out.println("Müþteri kimlik no eklendi");
			}else {
				System.out.println("Kimlik No kýsmý boþ geçilemez!");
			}
		}
		
		public void validateFirstNameLength(Customer customer) throws Exception {
			if(customer.getFirstName().length()<2) {
				throw new Exception("Doðrulama hatasý!");
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
			throw new Exception("Müþteri zaten mevcut.");
		}
	}
}
