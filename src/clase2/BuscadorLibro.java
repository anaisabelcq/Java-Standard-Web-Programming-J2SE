package clase2;

public class BuscadorLibro extends Buscador {

	public BuscadorLibro(String clave) {
		super(clave);
	}

	@Override
	public Resultado[] buscar() {
		
		String sql = "SELECT * FROM LIBROS WHERE TITUL LIKE '%" + clave + "%'";
		
		System.out.println("Ejecutando: " + sql);
		
		Resultado result1 = new Resultado("PROGRAMACION BASICA DE LIBROS", "JUAN PABLO SARASA", new Float(679), true);

		//creo el vector 
		Resultado[] resultados = {result1};
		
		return resultados;
		
	}
}
