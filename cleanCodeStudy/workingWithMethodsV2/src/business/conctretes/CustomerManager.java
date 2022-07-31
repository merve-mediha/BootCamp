package business.conctretes;

import business.abstracts.IPersonService;
import dataAccess.abstracts.ICustomerDal;
import entities.concretes.Customer;

public class CustomerManager {
	ICustomerDal  customerDal;
	IPersonService  personService;
	
	
	
	public CustomerManager(ICustomerDal customerDal, IPersonService personService) {
		 customerDal = customerDal;
		 personService = personService;
	}

	public void add(Customer customer) throws Exception {

		validateFirstNameIfEmpty(customer);
		validateIdentityNumberIfEmpty(customer);
		
		checkPersonExists(customer);
		checkCustomerExists(customer);
		customerDal.add(customer);

	}
	public void addByOtherBusiness(Customer customer) throws Exception {

		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		validateFirstNameLength(customer);

		checkCustomerExists(customer);
		customerDal.add(customer);

	}

	private void checkCustomerExists(Customer customer) throws Exception {
		if (customerDal.checkCustomerExists(customer)) {
			throw new Exception("M��teri zaten mevcut.");
		}
	}
	
	private void checkPersonExists(Customer customer) throws Exception {
		if (!personService.checkPerson(customer)) {
			throw new Exception("M��teri bilgilerini kontrol ediniz.");
		}
	}
	
	private void validateFirstNameIfEmpty(Customer customer) throws Exception {

		if (customer.getFistName().trim().isEmpty() || customer.getFistName() == null) {

			throw new Exception("M��teri ismi bo� ge�ilemez!");

		}
	}

	private void validateLastNameIfEmpty(Customer customer) throws Exception {

		if (customer.getLastName().trim().isEmpty() || customer.getLastName() == null) {

			throw new Exception("M��teri soyisim bo� ge�ilemez!");

		}
	}

	private void validateIdentityNumberIfEmpty(Customer customer) throws Exception {

		if (customer.getNationalIdentity().trim().isEmpty() || customer.getNationalIdentity() == null) {

			throw new Exception("Kimlik numaras� bo� ge�ilez!");

		}
	}

	private void validateFirstNameLength(Customer customer) throws Exception {

		if (customer.getFistName().length() < 2) {

			throw new Exception("M��teri ismi iki karakterden az olamaz.");

		}
	}
}
