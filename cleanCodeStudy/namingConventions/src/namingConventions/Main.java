package namingConventions;

public class Main {

	public static void main(String[] args) {
		//ClassName->PascalCase,  localVariable->camelCase yaz�l�r.
		ProductManager  productManager = new ProductManager();

	}

}

class ProductManager{
	
	//fieldName -> camelCase yaz�l�r
	int enBuyukSayi;
	
	//ConstructorName -> PascalCase yaz�l�r
	public ProductManager() {
		}
	
	//methodName -> camelCase,  argumentName -> camelCase  yaz�l�r
	public void getAllByCategoryId(int categoryId) {
		int enKucukSayi;
		
		enBuyukSayi=10;
	}
	
}
