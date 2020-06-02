package clase5.compra;

public class Item {

	private Long id;
	
	private Float precio;
	
	private String titulo;

	public Item(Long id, Float precio, String titulo) {
		super();
		this.id = id;
		this.precio = precio;
		this.titulo = titulo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", precio=" + precio + ", titulo=" + titulo + "]";
	}
	
}
