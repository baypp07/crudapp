package com.giustipp.crudapp.repository;
import com.giustipp.crudapp.entity.Person;
import java.util.List;

public interface PersonDAO {
    void save(Person person);
    void delete(Integer id);
    Person get(Integer id);
    List<Person>getAll();
}
