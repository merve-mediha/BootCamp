package referenceTypesDemo;

public class Main {

	public static void main(String[] args) {
		int sayi1=20;
		int sayi2=25;
		sayi1 = sayi2;
		sayi2=30;
		System.out.println(sayi1);
		
		int[] sayilar1=new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		sayilar1=sayilar2;
		sayilar2[0]=30;
		System.out.println(sayilar1[0]);
		
		
		Customer customer= new Customer(1,"Merve","0145");
		Customer customer2= customer;
		
		Person person1 = customer;
		Person person2= new Employee();
		
		PersonDal personDal = new PersonDal();
		personDal.add(new Customer());
		personDal.add(new Employee());
		personDal.add(new Visitor());
		
		//person inherit ettiði sýnýflarýn referansýný tutar
	}

}
