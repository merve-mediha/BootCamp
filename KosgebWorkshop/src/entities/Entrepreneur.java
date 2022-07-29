package entities;

public class Entrepreneur extends Applicant{
	private String firstName;
	private String lastName;
	
	
	


	public Entrepreneur(int id, String username, String password,String firstName, String lastName) {
		super(id, username, password);
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
