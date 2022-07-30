package referenceTypesDemo;

public class Person {
	private int id;
	private String firstName;
	
	
	
	public Person() {
		super();
	}
	
	
	
	public Person(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
}
