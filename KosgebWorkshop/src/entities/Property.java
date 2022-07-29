package entities;

import java.util.ArrayList;
import java.util.List;

public class Property {
	private int id;
	private String name; 
	private String value; 
	private final List<CreditProperty> creditProperties = new ArrayList<CreditProperty>();
	
	public Property(int id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<CreditProperty> getCreditProperties() {
		return creditProperties;
	}
	
	
}
