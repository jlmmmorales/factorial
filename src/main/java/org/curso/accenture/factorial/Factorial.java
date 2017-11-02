package org.curso.accenture.factorial;

/**
 * Class that computes the factorial of an integer (long) number
 * 
 * @author José Luis Martin Morales
 *
 */
public class Factorial {

	public long computar(long valor) {
		long result;
		if (valor < 0) {
			throw new factorialException("ERROR: The value is negative." + valor);
		} else if ((valor == 0) || (valor == 1)) {
			result = 1;
		} else {
			result = valor * computar(valor - 1);
		}
		
		return result;
	}

	public String toString() {
		return "";
	}
}
