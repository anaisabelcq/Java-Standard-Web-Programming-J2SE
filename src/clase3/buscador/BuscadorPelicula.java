package clase3.buscador;

public class BuscadorPelicula extends Buscador {

	public BuscadorPelicula(String clave) {
		super(clave);
	}

	@Override
	public String getSQL() {
		return "PELICUA WHERE TITULO LIKE '%" + this.clave + "%'";
	}
	
	@Override
	public Resultado[] buscar(String sql) {
		
		System.out.println("Ejecutando: " + sql);
		
		Resultado result1 = new Resultado("PROGRAMACION DE TV", "LOS HERMANOS W", new Float(1000), true);

		//creo el vector 
		Resultado[] resultados = {result1};
		
		return resultados;
		
	}
}
