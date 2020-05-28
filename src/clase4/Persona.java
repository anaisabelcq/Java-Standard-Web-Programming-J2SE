package clase4;

public class Persona implements Saludable {

	private String nombre;
	private Integer edad;
	
	//ALT+SHIFT+S
	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Persona(String nombre, Integer edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public static void main(String[] args) {
		Persona p = new Persona("carlos", 34);
		System.out.println(p);
	}
	
	@Override
	public String saludar() {
		return this.nombre + " hola como están?";
	}
}
