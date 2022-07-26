package telcoProject;

import java.time.LocalDate;

public class Invoice {
	private int id;
	private LocalDate dateCreated;
	private LocalDate dueCreated;
	private Subscription subscription;
	
	
	public Invoice() {
	}


	public Invoice(int id, LocalDate dateCreated, LocalDate dueCreated, Subscription subscription) {
		this.id = id;
		this.dateCreated = dateCreated;
		this.dueCreated = dueCreated;
		this.subscription = subscription;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}


	public LocalDate getDueCreated() {
		return dueCreated;
	}


	public void setDueCreated(LocalDate dueCreated) {
		this.dueCreated = dueCreated;
	}


	public Subscription getSubscription() {
		return subscription;
	}


	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	
	

}
