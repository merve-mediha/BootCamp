package entities;

public class CreditProperty {
	private int id;
	private Credit credit;
	private Property property;
	
	public CreditProperty(int id, Credit credit, Property property) {
		super();
		this.id = id;
		this.credit = credit;
		this.property = property;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Credit getCredit() {
		return credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}
}
