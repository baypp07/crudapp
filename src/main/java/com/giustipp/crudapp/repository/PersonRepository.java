package com.giustipp.crudapp.repository;
import com.giustipp.crudapp.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository implements PersonDAO{
    private final EntityManager entityManager;

    @Autowired
    public PersonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Person person) {
        entityManager.persist(person);

    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Person person= entityManager.find(Person.class,id);
        entityManager.remove(person);
    }
}
