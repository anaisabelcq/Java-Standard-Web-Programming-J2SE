package clase1;

public class Variables {

	public static void main(String[] args) {
		
		//definir variable
		int edad;
		
		//asignar un valor
		edad = 10;
		
		//nombre que podemos usar para las variables
		int _a;
		int $b;
		
		//VECTORES EN JAVA?
		
		int[] edades = {1,2,3,-10,50};
		
		int[] edades2 = new int[5];
		
		Object 	o = new int[5];// ?
		
				o = new float[1];
		
		for(int aux : edades) {
			System.out.println(aux);
		}
	}
}
