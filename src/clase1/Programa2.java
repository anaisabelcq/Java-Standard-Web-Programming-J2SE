package clase1;

/**
 * Ejercicio #1 
 * Construir un vector de enteros llamado vecNumeros e
 * inicializarlo con los números 11, -22, 33, -44, 55, -66, 77, -88, 99.
 * Acumular la suma de los valores positivos en una variable totalPositivos.
 * Acumular la suma de los valores negativos en una variable totalNegativos.
 * Imprimir en pantalla: los valores de totalPositivos y totalNegativos
 * Minimo
 * Maximo
 * indice del minimo
 * indice del maximo
 * 
 * CTRL+SHIFT+F
 *
 */
public class Programa2 {

	public static void main(String[] args) {
		
		int[] vecNumeros = {11, -22, 33, -44, 55, -66, 77, -88, 99};
		
		//acumulador
		int totalPositivos = 0;
		int totalNegativos = 0;
		int minimo = 0;
		int maximo = 0;
		int idxMin = 0;
		int idxMax = 0;
		
		//RECORRER EL VECTOR
		for (int i=0; i < vecNumeros.length ; i++ ) {
			
			if(i == 0) {
				minimo = vecNumeros[i];
				maximo = vecNumeros[i];
				idxMin = i;
				idxMax = i;
			}else {
				if(vecNumeros[i] < minimo ) {
					minimo = vecNumeros[i];
					idxMin = i;
				}
				if(vecNumeros[i] > maximo) {
					maximo = vecNumeros[i];
					idxMax = i;
				}
			}
			
			if(vecNumeros[i] > 0) {
				totalPositivos += vecNumeros[i];
			}else {
				totalNegativos += vecNumeros[i];
			}
		}
		
		//muestro los datos
		System.err.println("mínimo " + minimo + " - idx = " + idxMin);
		System.err.println("máximo " + maximo + " - idx = " + idxMax);
		System.err.println("totalNegativos" + totalNegativos);
		System.err.println("totalPositivos" + totalPositivos);
	}

}
