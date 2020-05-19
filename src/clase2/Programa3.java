package clase2;

public class Programa3 {

	public static void main(String[] args) {
		
		String clave = "programacion";
		
		Buscador bg = new BuscadorGeneral(clave);
		
		Buscador bp = new BuscadorPelicula(clave);
		
		Buscador bl = new BuscadorLibro(clave);

		Buscador[] buscadores = {bg, bp, bl};
		
		//recorrer los resultados y mostrarlos

		for(Buscador bAux : buscadores) {

			System.out.println("Ejecutando busqueda....");
			
			Resultado[] res = bAux.buscar();
			
			for(Resultado aux : res ) {
				System.out.println(aux);
			}
		}
		
	}
}
