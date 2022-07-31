package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Education;

public interface IEducationDal {
	void add(Education education);
    List<Education> getAll();
}
