package business.abstracts;

import java.util.List;

import entities.concretes.Education;

public interface ICampaignService {
	 void updatePrice(List<Education> educations);
}
