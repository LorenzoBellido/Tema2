package boletin3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variable donde guardar el número introducido
		int numero;
		// Variable donde guardar la suma de los positivos
		int sumapos = 0;
		// Variable donde guardar la suma de los negativos
		int sumaneg = 0;
		// Variable donde guardar la cantidad de números
		int cantidad = 0;
		// Variable donde guardar la cantidad de números negativos
		int cantidadneg = 0;
		// Variable donde guardar la cantidad de ceros
		int cantidadcer = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número al usuario
		System.out.println("Introduzca un número.");
		numero = sc.nextInt();

		while (cantidad != 10) {
			if (numero > 0) {
				sumapos += numero;
				cantidad++;
				System.out.println("Introduzca un número.");
				numero = sc.nextInt();
			}
			else if (numero < 0) {
				sumaneg =+ numero;
				cantidadneg++;
				cantidad++;
				System.out.println("Introduzca un número.");
				numero = sc.nextInt();
			}
			else {
				cantidadcer++;
				cantidad++;
				System.out.println("Introduzca un número.");
				numero = sc.nextInt();
			}
		}
		System.out.println(sumapos);
		System.out.println(sumaneg);
		System.out.println(cantidadneg)
		;System.out.println(sumaneg/cantidadneg);
		System.out.println(cantidadcer);
		
		// Cierro el Scanner
		sc.close();
	}

}
