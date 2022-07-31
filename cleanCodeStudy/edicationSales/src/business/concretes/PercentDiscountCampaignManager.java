package business.concretes;

import java.util.List;

import business.abstracts.ICampaignService;
import entities.concretes.Education;

public class PercentDiscountCampaignManager implements ICampaignService{
	
	@Override
	public void updatePrice(List<Education> educations) {
		for (Education education:educations){
            education.setPrice(education.getPrice()*(1.0-getPercentageDiscount()));
		
	}
	}
	
	 private double getPercentageDiscount() {
	        return Double.parseDouble("0.4");

}
}