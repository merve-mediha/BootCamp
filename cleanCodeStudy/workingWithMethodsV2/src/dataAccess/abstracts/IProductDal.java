package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Product;

public interface IProductDal {
	void add(Product product);
	List<Product> getAll();
}
