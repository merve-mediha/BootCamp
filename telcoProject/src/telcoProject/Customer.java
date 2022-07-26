package telcoProject;

import java.util.List;

public class Customer {
	private int id;
	private String musteriNo;
	List<Subscription> subscriptions;
	
	
	public Customer() {
	}
	
	
	
	public Customer(int id, String musteriNo, List<Subscription> subscriptions) {
		this.id = id;
		this.musteriNo = musteriNo;
		this.subscriptions = subscriptions;
	}

	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMusteriNo() {
		return musteriNo;
	}
	public void setMusteriNo(String musteriNo) {
		this.musteriNo = musteriNo;
	}
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
	
}
