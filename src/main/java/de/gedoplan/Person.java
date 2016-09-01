package de.gedoplan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

  @Id
  Long id;

  String name;

  String vorname;

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getVorname()
  {
    return vorname;
  }

  public void setVorname(String vorname)
  {
    this.vorname = vorname;
  }

}
