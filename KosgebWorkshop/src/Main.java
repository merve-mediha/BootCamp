import java.time.LocalDate;

import entities.Application;
import entities.ApplicationStatus;
import entities.Bank;
import entities.BankUser;
import entities.BlackList;
import entities.Corporate;
import entities.Credit;
import entities.CreditProperty;
import entities.Entrepreneur;
import entities.Personnel;
import entities.Property;
import entities.Role;
import entities.UserRole;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank(1, "Vak�fBank");
		
		BankUser bankUser = new BankUser(1, "Banka �al��an�", "123456", bank);
		bank.getBankUsers().add(bankUser);
		
		Personnel personnel = new Personnel(1, "testPerson", "123", "Adam", 1, "10000");
		
		Role role = new Role(1, "G�r�nt�leyebilir");
		UserRole userRole = new UserRole(1, role, personnel);
		
		Entrepreneur entrepreneur = new Entrepreneur(1, "test", "123", "Jane", "Brown");
		Corporate corporate = new Corporate(2, "KOB�", "123456", "Bir KOB�");
		
		BlackList blacklist = new BlackList(1);
		blacklist.getUsers().add(entrepreneur);
		
		Credit credit = new Credit(1, "Erzurum Kredisi", LocalDate.of(2022, 7, 1));
		
		Property property1 = new Property(1, "Destek Oran�", "1000");
		Property property2 = new Property(2, "�st Limit", "5000");
		Property property3 = new Property(3, "Alt Limit", "4000");
		Property property4 = new Property(4, "Kredi Hacmi", "200");
		Property property5 = new Property(5, "Yedek Hacmi", "50");
		Property property6 = new Property(6, "�l", "Erzurum");
		Property property7 = new Property(7, "Sekt�r", "Tar�m");
		
		CreditProperty creditProperty1 = new CreditProperty(1, credit, property1);
		CreditProperty creditProperty2 = new CreditProperty(1, credit, property2);
		CreditProperty creditProperty3 = new CreditProperty(1, credit, property3);
		CreditProperty creditProperty4 = new CreditProperty(1, credit, property4);
		CreditProperty creditProperty5 = new CreditProperty(1, credit, property5);
		CreditProperty creditProperty6 = new CreditProperty(1, credit, property6);
		CreditProperty creditProperty7 = new CreditProperty(1, credit, property7);
		
		credit.getCreditProperties().add(creditProperty1);
		credit.getCreditProperties().add(creditProperty2);
		credit.getCreditProperties().add(creditProperty3);
		credit.getCreditProperties().add(creditProperty4);
		credit.getCreditProperties().add(creditProperty5);
		credit.getCreditProperties().add(creditProperty6);
		credit.getCreditProperties().add(creditProperty7);
		
		property1.getCreditProperties().add(creditProperty7);
		
		ApplicationStatus applicationStatus1 = new ApplicationStatus(1, "Asil ba�vurunuz onay bekliyor.");
		ApplicationStatus applicationStatus2 = new ApplicationStatus(2, "Yedek ba�vurunuz onay bekliyor.");
		ApplicationStatus applicationStatus3 = new ApplicationStatus(3, "Ba�vurunuz onayland�.");
		ApplicationStatus applicationStatus4 = new ApplicationStatus(4, "Ba�vurunuz reddedildi.");
		
		Application application = new Application(1, corporate, credit, applicationStatus1);
		
		System.out.println("Ba�vuru: " + application.getId());
		System.out.println("\t Ba�vuru Sahibi'nin kullan�c� ismi: " + application.getApplicant().getUserName());
		System.out.println("\t Ba�vurulan kredi ismi: " + application.getCredit().getName());
		System.out.println("\t Ba�vurulan kredinin �zellikleri:");
		for(CreditProperty creditProperty : application.getCredit().getCreditProperties()) {
			System.out.println("\t\t"+creditProperty.getProperty().getName()+" : "+creditProperty.getProperty().getValue());
		}
		System.out.println("\t Ba�vuru durumu: " + application.getApplicationStatus().getStatusName());
		
		
	}

}
