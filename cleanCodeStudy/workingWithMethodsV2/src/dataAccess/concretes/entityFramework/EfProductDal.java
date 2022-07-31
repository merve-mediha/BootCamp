package dataAccess.concretes.entityFramework;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.IProductDal;
import entities.concretes.Product;

public class EfProductDal implements IProductDal{

	@Override
	public void add(Product product) {
		System.out.println("Ürün Entity Framework ile veritabanýna eklendi");
		
	}

	@Override
	public List<Product> getAll() {
		List<Product> products=new ArrayList<>();
        products.add(new Product(1,"Telefon"));
        products.add(new Product(2,"Ayakkabý"));
        return products;
	}

	

}
