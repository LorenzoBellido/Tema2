package boletin3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variable donde guardar el resultado final	
		int positivo = 0;
		// Variable donde guardar el número introducido
		int numero;
				
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
				
		// Pido un número al usuario
		System.out.println("Introduzca un número. ");
		numero = sc.nextInt();
				
		// Bucle donde se comprueba que numero es positivo
		while (numero >= 0) {
			// Condicional que en caso de que el número sea positivo suma 1
			if (numero > 0) {
			positivo++;
			System.out.println("Introduzca un número. Valor negativo para salir");
			numero = sc.nextInt();
			}
			else {
				positivo += 0;
				System.out.println("Introduzca un número. Valor negativo para salir");
				numero = sc.nextInt();
			}
		}
		// Muestro la cantidad de números positivos
		System.out.println("La cantidad de números positivos es: " + positivo);
		

		// Cierro el Scanner
		sc.close();
	}

}
