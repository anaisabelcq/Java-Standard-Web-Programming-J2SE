package clase5;

public class Main {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora(100,1);
		
		Double res = c.dividir();
		
		System.out.println("la division es: " + res);
		
		res = c.dividir(1,0);
	}

}
