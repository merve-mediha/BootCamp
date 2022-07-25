

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserService {
	
	List<User> users ;
	

	public UserManager() {
		users = new ArrayList<User>();
	}


	@Override
	public void register(User user) {
		users.add(user);
		user.getLogService().registerLog(user);
		
	}

	@Override
	public void forgotPassword(User user) {
		user.getLogService().passwordLog(user);
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}
	
	

}
