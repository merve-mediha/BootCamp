public class SmsLogService implements NotificationService {

	@Override
	public void registerLog(User user) {
		System.out.println("Sms ile kay�t olundu " + user.getFirstName());
		
	}

	@Override
	public void passwordLog(User user) {
		System.out.println("Sms ile kod yolland� " + user.getFirstName());
		
	}

	

	

}
