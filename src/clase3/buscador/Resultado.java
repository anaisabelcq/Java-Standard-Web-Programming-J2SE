package clase3.buscador;

public class Resultado {

	private String titulo;
	
	private String autor;
	
	private Float precio;
	
	private Boolean stock;
	
	public Resultado() {
		this.stock = true;
	}

	public Resultado(String titulo, String autor, Float precio, Boolean stock) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.stock = stock;
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Boolean getStock() {
		return stock;
	}

	public void setStock(Boolean stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Resultado [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", stock=" + stock + "]";
	}
}
