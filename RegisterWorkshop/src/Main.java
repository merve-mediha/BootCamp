public class Main {

	public static void main(String[] args) {

		User user1= new User(1,"Merve","Demiraslan","merve@gmail","12254", new SmsLogService());
		User user2= new User(2,"Merv","Demiraslan","merve@gmail","12254", new EmailLogService());
		UserManager userManager = new UserManager();
		userManager.register(user2);
		userManager.register(user1);
		
		
		userManager.forgotPassword(user2);
		
		
		
		for (User user : userManager.getAll()) {
			System.out.println(user.getFirstName());
			
		}
		
			
			
		
		

	
		}
}

