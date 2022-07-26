package telcoProject;

import java.util.List;

public class CorporateCustomer extends Customer{
	private String companyName;
	private int taxNumber;
	
	public CorporateCustomer() {
		super();
	}
	public CorporateCustomer(String companyName, int taxNumber,int id, String musteriNo, List<Subscription> subscriptions) {
		super(id,  musteriNo,  subscriptions);
		this.companyName = companyName;
		this.taxNumber = taxNumber;
		
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(int taxNumber) {
		this.taxNumber = taxNumber;
	}
	
	
}
