package clase4.volador;

public class Estado {

	private Boolean error;
	
	private String descripcion;

	public Estado(Boolean error, String descripcion) {
		this.error = error;
		this.descripcion = descripcion;
	}

	public Boolean getError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Estado [error=" + error + ", descripcion=" + descripcion + "]";
	}
	
}
