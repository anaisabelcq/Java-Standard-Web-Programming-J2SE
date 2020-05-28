package clase4;

public class Batman extends SuperHeroe {

	public Batman(String nombre) {
		super(nombre, Boolean.TRUE);
	}

	@Override
	public String toString() {
		return "Batman [tieneCapa=" + tieneCapa + ", nombre=" + nombre + "]";
	}
}
