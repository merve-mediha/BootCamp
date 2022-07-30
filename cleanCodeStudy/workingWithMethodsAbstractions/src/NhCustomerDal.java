
public class NhCustomerDal implements CustomerDal{

	@Override
	public void add(Customer customer) {
		System.out.println("Nhibernate kullanarak veritabanýna eklendi");
		
	}

	@Override
	public boolean customerExists(Customer customer) {
		return true;
	}

}
