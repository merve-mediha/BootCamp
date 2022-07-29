package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Credit {
	private int id;
	private String name;
	private LocalDate startDate;
	private final List<CreditProperty> creditProperties = new ArrayList<>();
	private final List<Application> applications = new ArrayList<>();
	
	public Credit(int id, String name, LocalDate startDate) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
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

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public List<CreditProperty> getCreditProperties() {
		return creditProperties;
	}

	public List<Application> getApplications() {
		return applications;
	}
}
