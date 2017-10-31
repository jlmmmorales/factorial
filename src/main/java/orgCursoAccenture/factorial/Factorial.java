package orgCursoAccenture.factorial;

public class Factorial {

	public long computar(long valor) {
		if ((valor == 0) || (valor == 1)) {
			return 1;
		} else if (valor == 2) {
			return 2;
		} else {
			return valor * computar(valor - 1);
		}
	}
}
