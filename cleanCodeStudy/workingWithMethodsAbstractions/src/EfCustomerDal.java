

public class EfCustomerDal implements CustomerDal {

	@Override
	public void add(Customer customer) {
		System.out.println("Entity Framework kullanarak veritaban�na eklendi");
		
	}

	@Override
	public boolean customerExists(Customer customer) {
		return false;
	}

}