package clase1;

public class TipoDatos {

	public static void main(String[] args) {
		
		//boolean -> tipo primitivo
		//Boolean -> wrapper
		
		// c/c++/java/js
		// enteros sin coma
		byte by = 8;  	Byte byw;	
		
		// "1" -> byte?
		String valorStr = "1";
		byte aux = Byte.parseByte(valorStr);
		
		short s = 1;	Short sw;
		int a = 1;		Integer aw;
		long b = 1;		Long bw;

		//soporta decimales
		float e;		Float ew;
		double c;		Double cw;
		Double auxd = Double.parseDouble("1");
		
		//verdadero o false
		boolean flag;	Boolean flagW;
		
		char unCaracter = 'C'; Character cha;
		String cadena = "C";
	}
}
