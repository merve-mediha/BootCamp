package core.adapters;

import business.abstracts.IPersonService;
import entities.concretes.Person;

public class KpsServiceAdapter implements IPersonService {

	@Override
	public boolean checkPerson(Person person) {
		KpsService kpsService = new KpsService();
		return kpsService.checkPerson(person.getNationalIdentity(), person.getFistName(), person.getLastName(), person.getYearOfBirth());
	}

}
