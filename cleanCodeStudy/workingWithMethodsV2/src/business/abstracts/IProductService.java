package business.abstracts;

import java.util.List;

import entities.concretes.Product;

public interface IProductService {
	List<Product> getAll();
}
