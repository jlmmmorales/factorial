package org.curso.accenture.factorial;

import static org.junit.Assert.assertEquals;
import org.curso.accenture.factorial.Factorial;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

  private Factorial factorial;

  @Before
  public void init() {
    factorial = new Factorial();
  }

  @Test
  public void testFactorialOfZeroReturnOne() {
    // Factorial factorial = new Factorial();

    long result = factorial.computar(0);
    long expectedValue = 1;

    assertEquals(expectedValue, result);
  }

  @Test
  public void testFactorialOfOneReturnTwo() {
    // Factorial factorial = new Factorial();

    long result = factorial.computar(1);
    long expectedValue = 1;

    assertEquals(expectedValue, result);
  }

  @Test
  public void testFactorialOfTwoReturnTwo() {
    // Factorial factorial = new Factorial();

    long result = factorial.computar(2);
    long expectedValue = 2;

    assertEquals(expectedValue, result);
  }

  @Test
  public void testFactorialOfThreeReturnSix() {
    // Factorial factorial = new Factorial();

    long result = factorial.computar(3);
    long expectedValue = 6;

    assertEquals(expectedValue, result);
  }

  @Test
  public void testFactorialOfFiveReturnOneHundredAndTwenty() {
    // Factorial factorial = new Factorial();

    long result = factorial.computar(5);
    long expectedValue = 120;

    assertEquals(expectedValue, result);
  }

  @Test(expected = RuntimeException.class)
  public void testFactorialOfNegativeValueReturnException() {
    // Factorial factorial = new Factorial();

    long result = factorial.computar(-1);
    long expectedValue = 0;

    assertEquals(expectedValue, result);
  }
}
