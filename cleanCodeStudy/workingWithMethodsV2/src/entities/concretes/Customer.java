package entities.concretes;

public class Customer extends Person{
	private int cityId;

	
	public Customer() {
		super();
	}

	public Customer(int cityId,int id, String nationalIdentity, String fistName, String lastName, int yearOfBirth) {
		super(id, nationalIdentity, fistName, lastName, yearOfBirth);
		this.cityId = cityId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
	

}
