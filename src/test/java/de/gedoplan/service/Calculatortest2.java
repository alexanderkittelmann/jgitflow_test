package de.gedoplan.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Calculatortest2 {

  private Calculator calculator;

  @Before
  public void setUp()
  {
    calculator = new Calculator();
  }

  @Test
  public void testDividieren()
  {
    Assert.assertEquals(calculator.dividieren(2, 2).intValue(), 1);
  }
}
