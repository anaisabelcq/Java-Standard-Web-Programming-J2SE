package clase2;

public class BuscadorGeneral extends Buscador {

	public BuscadorGeneral(String clave) {
		super(clave);
	}

	@Override
	public Resultado[] buscar() {
		
		String sql = "SELECT * FROM ARTICULOS WHERE TITUL LIKE '%" + super.clave + "%'";
		
		System.out.println("Ejecutando: " + sql);
		
		Resultado result1 = new Resultado("PROGRAMACION BASICA", "FIGUEROA, LEONEL", new Float(679), true);
		Resultado result2 = new Resultado("PROGRAMACION PARA NI�OS 1", "PE�A MILLAHUAL, CLAUDIO A.", new Float(578), true);
		Resultado result3 = new Resultado("PROGRAMACION NI�OS 2", "PE�A MILLAHUAL, CLAUDIO A.", new Float(649), true);

		//creo el vector 
		Resultado[] resultados = {result1, result2, result3};
		
		return resultados;
		
	}
}
