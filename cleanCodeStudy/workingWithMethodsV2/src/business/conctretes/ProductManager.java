package business.conctretes;

import java.util.List;

import business.abstracts.IProductService;
import dataAccess.abstracts.IProductDal;
import entities.concretes.Product;

public class ProductManager implements IProductService {
	private IProductDal productDal;

	public ProductManager(IProductDal productDal) {
		this.productDal = productDal;
	}
	
	@Override
	public List<Product> getAll() {
		return productDal.getAll();
	}
	

}
