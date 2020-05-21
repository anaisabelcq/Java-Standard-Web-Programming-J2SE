package clase3.buscador;

public class BuscadorLibro extends Buscador {

	public BuscadorLibro(String clave) {
		super(clave);
	}

	@Override
	public String getSQL() {
		return " libro where titulo like '%"+ this.clave+ "%'";
	}
	
	@Override
	public Resultado[] buscar(String sql) {
		
		String query =  SQL_GENERAL + sql;
		
		System.out.println("Ejecutando: " + query);
		
		Resultado result1 = new Resultado("PROGRAMACION BASICA DE LIBROS", "JUAN PABLO SARASA", new Float(679), true);

		//creo el vector 
		Resultado[] resultados = {result1};
		
		return resultados;
		
	}
}
