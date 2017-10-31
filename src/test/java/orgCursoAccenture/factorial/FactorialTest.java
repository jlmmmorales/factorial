package orgCursoAccenture.factorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {
	@Test
	public void test1() {
		Factorial factorial = new Factorial();
		
		long result = factorial.computar(0);
		long expectedValue = 1;
		
		assertEquals(expectedValue, result);
	}
	
	@Test
	public void test2() {
		Factorial factorial = new Factorial();
		
		long result = factorial.computar(1);
		long expectedValue = 1;
		
		assertEquals(expectedValue, result);
	}
	
	@Test
	public void test3() {
		Factorial factorial = new Factorial();
		
		long result = factorial.computar(2);
		long expectedValue = 2;
		
		assertEquals(expectedValue, result);
	}
	
	@Test
	public void test4() {
		Factorial factorial = new Factorial();
		
		long result = factorial.computar(3);
		long expectedValue = 6;
		
		assertEquals(expectedValue, result);
	}
	
	@Test
	public void test5() {
		Factorial factorial = new Factorial();
		
		long result = factorial.computar(5);
		long expectedValue = 120;
		
		assertEquals(expectedValue, result);
	}
}
