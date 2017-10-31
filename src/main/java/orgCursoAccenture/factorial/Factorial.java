package orgCursoAccenture.factorial;

/**
 * Class that computes the factorial of an integer (long) number
 * @author José Luis Martin Morales
 *
 */
public class Factorial {

	public long computar(long valor) {
		if (valor < 0) {
			throw new RuntimeException("ERROR: The value is negative." + valor);
		} else if ((valor == 0) || (valor == 1)) {
			return 1;
		} else {
			return valor * computar(valor - 1);
		}
	}
}
