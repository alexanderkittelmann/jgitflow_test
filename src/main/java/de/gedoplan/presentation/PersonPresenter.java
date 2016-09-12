package de.gedoplan.presentation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.gedoplan.domain.Person;
import de.gedoplan.repository.PersonRepository;

@Named
@RequestScoped
public class PersonPresenter {

  @Inject
  Person person;

  // @Inject
  // PersonRepository personRepository;

  public void persist()
  {
    //personRepository.persist(this.person);
  }

  public Person getPerson()
  {
    return person;
  }

  public void setPerson(Person person)
  {
    this.person = person;
  }

}
