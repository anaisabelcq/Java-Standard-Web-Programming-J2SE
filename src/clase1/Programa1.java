package clase1;

import java.util.Scanner;

/*
 * COMENTARIO MULTILINEA:
 * 
 * SE INGRESAN 3 NOTAS.
 * determinar la suma de las notas
 * promedio -> suma/cantidad
 * mayor -> determinar cual de los 3 valores es mayor if()....
 * menor idem pero con el menor... if()...
 */
public class Programa1 {

	//ctrl + space
	public static void main(String[] args) {
	
		//operadores aritmeticos
		
		int nota1, nota2, nota3;
		int cantidadNotas = 3;
		int mayor = 0;
		int menor = 0;
		int sumaNotas = 0; // 0 - 10
		float promedio = 0;
		
		//asignar valores notas
		// leer desde el teclado las tres notas
		Scanner teclado = new Scanner(System.in);
		
		nota1 = validarNota(teclado, "primera");
		
		nota2 = validarNota(teclado, "sugunda");
		
		nota3 = validarNota(teclado, "tercer");
		
		//suma de las notas
		sumaNotas = nota1 + nota2 + nota3;
		
		//promedio
		promedio = sumaNotas / cantidadNotas;
		
		//mayor 
		if(nota1 >= nota2 && nota1 >= nota3) {
			mayor = nota1;
		}
		if(nota2 >= nota1 && nota2 >= nota3) {
			mayor = nota2;
		}
		if(nota3 >= nota2 && nota3 >= nota1) {
			mayor = nota3;
		}
		
		//minimo
		if(nota1 <= nota2 && nota1 <= nota3) {
			menor = nota1;
		}
		if(nota2 <= nota1 && nota2 <= nota3) {
			menor = nota2;
		}
		if(nota3 <= nota2 && nota3 <= nota1) {
			menor = nota3;
		}
		
		// mostrar datos en consola
		System.out.println("La suma de las notas es: " + sumaNotas);
		System.out.println("El promedio de las notas es: " + promedio);
		System.out.println("El mayor de las notas es: " + mayor);
		System.out.println("La menor de las notas es: " + menor);
 	}

	private static int validarNota(Scanner teclado, String texto) {
		int nota = 0;
		//validacion con do while
		boolean valido = false;
		do {
			System.out.print("Ingrese la "+ texto +" nota \t");
			
			String auxiliar = teclado.next();
			try {
				nota = Integer.parseInt(auxiliar);
				valido =true;
			}catch (Exception e) {
				valido = false;
			}
		}while(!valido);
		
		return nota;
	}
}
