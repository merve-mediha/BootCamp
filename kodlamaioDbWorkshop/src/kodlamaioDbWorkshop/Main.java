package kodlamaioDbWorkshop;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Canal canal = new Canal(1,"Ýnternet");
		Customer customer = new IndividualCustomer(1,"1542",canal,"Merve","Demiraslan","5148752");
		Address address = new Address(1," ", customer);
		
		System.out.println(customer.getId());
		System.out.println(customer.getCanal().getName());
		System.out.println(address.getCustomer().getCustomerNumber());
		System.out.println(((IndividualCustomer) customer).getFirstName()+" "+((IndividualCustomer) customer).getLastName());

		
		CommercialActivity commercialActivity = new CommercialActivity(1,LocalDate.parse("2022-07-26"),(IndividualCustomer) customer);
		System.out.println(commercialActivity.getIndividualCustomer().getNationalIdentity());

}
}
