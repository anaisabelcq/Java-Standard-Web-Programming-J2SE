package clase3.buscador;

public abstract class Buscador {
	
	protected final static String SQL_GENERAL = "select * from ";
	
	protected String clave;

	public Buscador(String clave) {
		this.clave = clave;
	}
	
	public Resultado[] buscar() {
		
//		String sqlGeneral = "select * from ";
		
		//llamar a las consultas hijas
		String sqlParticular = getSQL();
		
		String sqlFinal = sqlParticular;
		
		return buscar(sqlFinal);
	}

	protected abstract String getSQL();
	
	protected abstract Resultado[] buscar(String sql);
}
