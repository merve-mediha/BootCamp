public class EmailLogService implements NotificationService{

	@Override
	public void registerLog(User user) {
		System.out.println("Email ile kayýt olundu " + user.getFirstName());
		
	}

	@Override
	public void passwordLog(User user) {
		
		System.out.println("Email ile kod yollandý "+user.getFirstName());
		
	}

	

	

}
