package business.concretes;

import java.util.List;

import business.abstracts.ICampaignService;
import business.abstracts.IEducationService;
import dataAccess.abstracts.IEducationDal;
import entities.concretes.Education;

public class EducationManager implements IEducationService {
		IEducationDal educationDal;
	    ICampaignService campaignService;
	    
	    
	public EducationManager(IEducationDal educationDal, ICampaignService campaignService) {
			super();
			this.educationDal = educationDal;
			this.campaignService = campaignService;
		}


	@Override
	public List<Education> getAll() {
		List<Education> educations = educationDal.getAll();
        campaignService.updatePrice(educations);
        return educations;
	}

}
