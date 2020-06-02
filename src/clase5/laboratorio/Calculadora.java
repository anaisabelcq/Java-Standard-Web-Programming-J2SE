package clase5.laboratorio;

import clase5.exceptions.FueraRangoException;

public class Calculadora {
	
	// no tiene atributos
	public static int sumar(int a, int b) throws FueraRangoException{
		if(a < 0 || a > 1000) {
			throw new FueraRangoException("El valor " + a + "esta fuera de rango  (0 - 1000)");
		}
		
		if(b < 0 || b > 1000) {
			throw new FueraRangoException("El valor " + b + "esta fuera de rango  (0 - 1000)");
		}
		
		return a +b;
	}
	
	public static int restar(int a, int b) throws FueraRangoException {
		if(a < 0 || b < 0) {
			throw new FueraRangoException("Algun valor es menor a 0");
		}
		
		if( (b - a) < 0) {
			throw new FueraRangoException("la resta de " + a + "+ y " +b + " es menor a 0" );
		}
		
		return b - a;
	}
	
	public static void main(String[] args) {
		
		try {
			int res = Calculadora.sumar(1, 50);
			System.out.println("la suma es" + res);
		} catch (FueraRangoException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("la resta es " + Calculadora.restar(2, 1));
		} catch (FueraRangoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
