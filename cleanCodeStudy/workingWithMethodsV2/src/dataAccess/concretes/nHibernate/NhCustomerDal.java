package dataAccess.concretes.nHibernate;

import dataAccess.abstracts.ICustomerDal;
import entities.concretes.Customer;

public class NhCustomerDal implements ICustomerDal {

	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate ile veritabanưna eklendi.");
		
	}

	@Override
	public boolean checkCustomerExists(Customer customer) {
		return true;
	}

}
