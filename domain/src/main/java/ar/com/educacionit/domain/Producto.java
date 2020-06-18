package ar.com.educacionit.domain;

public class Producto implements Comparable<Producto> {

	private Long id;
	private String descripcion;
	private Float precio;
	private String codigo;
	private Long tipoProducto;/// 1 electrodomestico; 2 computacion; etc
	
	public Producto(Long id, String descripcion, Float precio, String codigo) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigo = codigo;
	}

	public Producto(String descripcion, Float precio, String codigo) {
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigo = codigo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + ", codigo=" + codigo
				+ "]";
	}

	@Override
	public int compareTo(Producto p) {
		return this.getPrecio().compareTo(p.getPrecio());
	}

	public Long getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(Long tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
	
}
