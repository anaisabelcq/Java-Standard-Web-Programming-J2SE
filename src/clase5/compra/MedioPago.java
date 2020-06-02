package clase5.compra;

public class MedioPago {

	private Long id;
	
	private String nombre;
	
	private Integer moneda;// 1= peso; 2= dolar

	public MedioPago(Long id, String nombre, Integer moneda) {
		this.id = id;
		this.nombre = nombre;
		this.moneda = moneda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getMoneda() {
		return moneda;
	}

	public void setMoneda(Integer moneda) {
		this.moneda = moneda;
	}

	@Override
	public String toString() {
		return "MedioPago [id=" + id + ", nombre=" + nombre + ", moneda=" + moneda + "]";
	}
	
}
