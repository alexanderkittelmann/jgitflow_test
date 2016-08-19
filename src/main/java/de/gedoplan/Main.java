package de.gedoplan;

import de.gedoplan.service.Calculator;

public class Main
{

  public static void main(String[] args)
  {
    Calculator calculator = new Calculator();
    
    System.out.println(calculator.addieren(2, 3));
    System.out.println(calculator.subtrahieren(2, 3));
    System.out.println(calculator.multiplizieren(2, 3));
  }
}
