package com.giustipp.crudapp.repository;

import com.giustipp.crudapp.entity.Person;

public interface PersonDAO {
    void save(Person person);
    void delete(Integer id);
}
