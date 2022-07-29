package entities;

public class Corporate extends Applicant{
	private String title;


	public Corporate(int id, String userName, String password,String title) {
		super(id, userName, password);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
