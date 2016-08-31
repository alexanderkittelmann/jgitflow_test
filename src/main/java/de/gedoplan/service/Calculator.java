package de.gedoplan.service;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class Calculator implements Serializable
{  
  public Integer addieren(Integer value1, Integer value2) {
    return value1 + value2;
  }
  
  public Integer subtrahieren(Integer value1, Integer value2) {
    return value1 - value2;
  }
  
  public Integer multiplizieren(Integer value1, Integer value2) {
    return value1 * value2;
  }
  
  public Integer dividieren(Integer value1, Integer value2) {
    return value1 / value2;
  }
}
