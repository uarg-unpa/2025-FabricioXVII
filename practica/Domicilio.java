//cambios
public class Domicilio {
	private String calle;
	private int numero;

	public Domicilio(String calle, int numero) {
		if (calle != null && !calle.trim().isEmpty()) {
			this.calle = calle;
		}
		if (numero > 0) {
			this.numero = numero;
		}
	}

	public String getCalle() {
		return calle;
	}

	public boolean esCompleto() {
		if (calle != null && !calle.isEmpty() && numero > 0)
			return true;
		else
			return false;
	}

	public String toString() {
		return calle + " " + numero;
	}
}
