package clase3.buscador;

public class BuscadorGeneral extends Buscador {

	public BuscadorGeneral(String clave) {
		super(clave);
	}

	@Override
	protected String getSQL() {
		return "articulo where tipo_articlo in(1,2,3,4)";
	}

	@Override
	public Resultado[] buscar(String sql) {
		
		//invocar a la db
		System.out.println("Ejecutando sql" + sql);
		
		Resultado result1 = new Resultado("PROGRAMACION BASICA", "FIGUEROA, LEONEL", new Float(679), true);
		Resultado result2 = new Resultado("PROGRAMACION PARA NIÑOS 1", "PEÑA MILLAHUAL, CLAUDIO A.", new Float(578), true);
		Resultado result3 = new Resultado("PROGRAMACION NIÑOS 2", "PEÑA MILLAHUAL, CLAUDIO A.", new Float(649), true);

		//creo el vector 
		Resultado[] resultados = {result1, result2, result3};
		
		return resultados;
	}
}
