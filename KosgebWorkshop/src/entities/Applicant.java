package entities;

import java.util.ArrayList;
import java.util.List;

public class Applicant extends User {

	private final List<Application> applications = new ArrayList<Application>();
	
	
	public Applicant(int id, String userName, String password) {
		super(id, userName, password);
		
	}






	public List<Application> getApplications() {
		return applications;
	}
	
	
	

	
	
}
