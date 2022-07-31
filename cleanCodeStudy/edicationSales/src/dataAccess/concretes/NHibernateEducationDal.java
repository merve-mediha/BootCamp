package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.IEducationDal;
import entities.concretes.Education;

public class NHibernateEducationDal implements IEducationDal{
	

	@Override
	public List<Education> getAll() {
		List<Education> educations = new ArrayList<>();
		educations.add(new Education(1, "C# Kursu", 400));
		educations.add(new Education(2, "Java Kursu", 300));
		educations.add(new Education(3, "Python Kursu", 200));
		 return educations;
	}

}
