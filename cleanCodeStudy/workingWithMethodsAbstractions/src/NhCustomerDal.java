
public class NhCustomerDal implements CustomerDal {

		public void add(Customer customer) {
		System.out.println("Nhibernate kullanarak veritabanýna eklendi");
		
	}

		@Override
		public boolean customerExists(Customer customer) {
			
			return false;
		}

	
}
