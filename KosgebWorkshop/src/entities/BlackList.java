package entities;

import java.util.ArrayList;
import java.util.List;

public class BlackList {
	private int id;
	
	private final List<User> users = new ArrayList<User>();     //app

	



	public BlackList(int id ) {
		super();
		this.id = id;
		
	}

	
	
	


	public List<User> getUsers() {
		return users;
	}






	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
