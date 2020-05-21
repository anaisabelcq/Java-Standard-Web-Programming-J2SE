package clase3.buscador;

public class Programa1 {

	public static void main(String[] args) {
		
		String clave = "programacion";
		
		// 1) general
		Buscador bg = new BuscadorGeneral(clave);

		Resultado[] resultado = bg.buscar();
		
	}

}
