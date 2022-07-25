package kodlamaioDbWorkshop;

import java.time.LocalDate;

public class CommercialActivity {
	private int id;
	private LocalDate startedDate;
	private IndividualCustomer individualCustomer;
	
	
	public CommercialActivity() {
	}


	public CommercialActivity(int id, LocalDate startedDate, IndividualCustomer individualCustomer) {
		this.id = id;
		this.startedDate = startedDate;
		this.individualCustomer = individualCustomer;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getStartedDate() {
		return startedDate;
	}


	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}


	public IndividualCustomer getIndividualCustomer() {
		return individualCustomer;
	}


	public void setIndividualCustomer(IndividualCustomer individualCustomer) {
		this.individualCustomer = individualCustomer;
	}
	
	
	
}
