package entities;

public class Personnel extends User {
	private String name, personnelId;
	private int officeId;
	
	public Personnel(int id, String username, String password, String name, int officeId, String personnelId) {
		super(id, username, password);
		this.name = name;
		this.officeId = officeId;
		this.personnelId = personnelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOfficeId() {
		return officeId;
	}

	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}

	public String getPersonnelId() {
		return personnelId;
	}

	public void setPersonnelId(String personnelId) {
		this.personnelId = personnelId;
	}
}
