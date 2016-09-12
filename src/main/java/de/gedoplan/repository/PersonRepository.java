package de.gedoplan.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import de.gedoplan.domain.Person;

public class PersonRepository {
  
  /* @PersistenceContext(unitName="test")
  EntityManager entityManager;
  
  @Transactional
  public void persist(Person person)
  {
    entityManager.persist(person);
  }*/
}
