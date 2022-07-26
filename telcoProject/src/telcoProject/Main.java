package telcoProject;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Subscription subscription = new Subscription();
		List<Subscription> subscritions = new ArrayList<Subscription>();
		Customer customer1 = new IndividualCustomer();
		customer1.setSubscriptions(subscritions);
	}

}
