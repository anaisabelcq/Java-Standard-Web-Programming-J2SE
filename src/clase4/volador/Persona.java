package clase4.volador;

public class Persona {

	private String nombre;
	
	private String apellido;
	
	public String getNombreCompleto() {
		//JuAN, Perez
		
		return convertirACapitalLetter(nombre) + ", " + convertirACapitalLetter(apellido);		
	}
	
	public String convertirACapitalLetter(String aux) {
		
		String nombreMinuscula = aux.substring(1, aux.length());//uAN
		
		nombreMinuscula = nombreMinuscula.toLowerCase();//uan
		
		String primerLetra = aux.substring(0,1).toUpperCase();//J
		
		return primerLetra + nombreMinuscula;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setApellido("PEREZ");
		p.setNombre("JauN");
		
		System.out.println(p.getNombreCompleto());
	}

}
