
public class NhCustomerDal implements CustomerDal{

	@Override
	public void add(Customer customer) {
		System.out.println("Nhibernate kullanarak veritaban�na eklendi");
		
	}

	@Override
	public boolean customerExists(Customer customer) {
		return true;
	}

}
