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

		// Realizo un bucle que para cuando se introducen 10 numeros
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
		
		// Muestro los resultados pedidos
		System.out.println("La suma de los números positivos es: " + sumapos);
		System.out.println("La media de los números negativos es: " + sumaneg/cantidadneg);
		System.out.println("La cantidad de ceros es: " + cantidadcer);
		
		// Cierro el Scanner
		sc.close();
	}

}
