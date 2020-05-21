package clase3.humano;

public class Programa2 {

	public static void main(String[] args) {
		Hombre h = new Hombre();
		
		System.out.println("cantidad de ojos de h " + h.cantidadOjos);
		
		System.out.println(Humano.getRaza());
		
		// h.cantidadOjos = 3;
		
		Mujer m = new Mujer();
		
		System.out.println("cantidad de ojos de m " + m.cantidadOjos);
		
		Integer co =  Humano.cantidadOjos;
		
		System.out.println("cantidad de ojos de Humano " + Humano.cantidadOjos);
		
		//uso de un metodo de clase
		// Clase.metodo();
		String raza = Humano.getRaza();
	}

}
