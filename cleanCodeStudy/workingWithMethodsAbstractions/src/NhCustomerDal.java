
public class NhCustomerDal implements CustomerDal {

		public void add(Customer customer) {
		System.out.println("Nhibernate kullanarak veritaban�na eklendi");
		
	}

		@Override
		public boolean customerExists(Customer customer) {
			
			return false;
		}

	
}
