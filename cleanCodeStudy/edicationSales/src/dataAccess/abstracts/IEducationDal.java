package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Education;

public interface IEducationDal {
    List<Education> getAll();
}
