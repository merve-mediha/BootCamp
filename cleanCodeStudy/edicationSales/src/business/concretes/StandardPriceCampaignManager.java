package business.concretes;

import java.util.List;

import business.abstracts.ICampaignService;
import entities.concretes.Education;

public class StandardPriceCampaignManager implements ICampaignService{

	@Override
	public void updatePrice(List<Education> educations) {
		for (Education education : educations) {
            education.setPrice(getCurrentStandardPrice());
        }
	}
		private double getCurrentStandardPrice() {
			return 90;
	}

}
