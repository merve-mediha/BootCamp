package entities;

public class Application {
	private int id;
	private  Applicant applicant;
	private Credit credit;
	private ApplicationStatus applicationStatus;
	
	public Application() {
		super();
	}

	public Application(int id, Applicant applicant, Credit credit, ApplicationStatus applicationStatus) {
		super();
		this.id = id;
		this.applicant = applicant;
		this.credit = credit;
		this.applicationStatus = applicationStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public Credit getCredit() {
		return credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}

	public ApplicationStatus getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(ApplicationStatus applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	
	
	

}
