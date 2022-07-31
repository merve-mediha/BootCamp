import business.abstracts.IEducationService;
import business.concretes.EducationManager;
import business.concretes.PercentDiscountCampaignManager;
import dataAccess.concretes.NHibernateEducationDal;
import entities.concretes.Education;

public class Main {

	public static void main(String[] args) {
		IEducationService educationService = new EducationManager(new NHibernateEducationDal(),new PercentDiscountCampaignManager());
        for (Education education : educationService.getAll())
            System.out.println(education.getName()+" = " + education.getPrice()+" TL");
    }

	}


