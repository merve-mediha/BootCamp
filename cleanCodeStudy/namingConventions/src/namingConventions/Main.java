package namingConventions;

public class Main {

	public static void main(String[] args) {
		//ClassName->PascalCase,  localVariable->camelCase yazýlýr.
		ProductManager  productManager = new ProductManager();

	}

}

class ProductManager{
	
	//fieldName -> camelCase yazýlýr
	int enBuyukSayi;
	
	//ConstructorName -> PascalCase yazýlýr
	public ProductManager() {
		}
	
	//methodName -> camelCase,  argumentName -> camelCase  yazýlýr
	public void getAllByCategoryId(int categoryId) {
		int enKucukSayi;
		
		enBuyukSayi=10;
	}
	
}
