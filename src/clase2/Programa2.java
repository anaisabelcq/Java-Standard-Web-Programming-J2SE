package clase2;

public class Programa2 {

	public static void main(String[] args) {
		
		String clave = "programacion";
		
		Buscador b = new BuscadorGeneral(clave);
		
		Resultado[] res = b.buscar();
		
		//recorrer los resultados y mostrarlos
		System.out.println("Se han encontrado los stes resultado:");
		for(Resultado aux : res ) {
			System.out.println(aux);
		}
		
		System.out.println("----------------------------------------");
		//OTRO MAS
		b = new BuscadorPelicula(clave);
		res = b.buscar();
		
		//recorrer los resultados y mostrarlos
		System.out.println("Se han encontrado los stes resultado:");
		for(Resultado aux : res ) {
			System.out.println(aux);
		}
		
		System.out.println("----------------------------------------");
		b = new BuscadorLibro(clave);
		res = b.buscar();
		
		//recorrer los resultados y mostrarlos
		System.out.println("Se han encontrado los stes resultado:");
		for(Resultado aux : res ) {
			System.out.println(aux);
		}
	}
}
