package de.gedoplan;

import javax.inject.Inject;

import de.gedoplan.service.Calculator;

public class InjectTest
{
  @Inject
  Calculator calculator;

  public Integer injectTest() {
    return calculator.addieren(3, 3);
  }
}
