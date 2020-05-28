package clase4;

public class Programa1 {

	public static void main(String[] args) {
		/*
		Clase c = new Clase();
		Padre p = new Hijo();
		Hijo h = new Padre();
		*/
		
		//la que usa SPRING, Hibernate
		Saludable carlos = new Persona("carlos", 34);
		Persona ariel = new Persona("carlos", 34);
		
		//una variable auxiliar
		((Persona)carlos).getEdad();
		((Persona)carlos).getNombre();
		carlos.saludar();//interface

		ariel.saludar();
	}

}
