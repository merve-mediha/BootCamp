public class EmailLogService implements NotificationService{

	@Override
	public void registerLog(User user) {
		System.out.println("Email ile kay�t olundu " + user.getFirstName());
		
	}

	@Override
	public void passwordLog(User user) {
		
		System.out.println("Email ile kod yolland� "+user.getFirstName());
		
	}

	

	

}
