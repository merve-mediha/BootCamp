public class SmsLogService implements NotificationService {

	@Override
	public void registerLog(User user) {
		System.out.println("Sms ile kayýt olundu " + user.getFirstName());
		
	}

	@Override
	public void passwordLog(User user) {
		System.out.println("Sms ile kod yollandý " + user.getFirstName());
		
	}

	

	

}
