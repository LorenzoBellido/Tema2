package boletin3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variable donde guardar el resultado final	
		int suma = 0;
		// Variable donde guardar el número introducido
		int numero;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número al usuario
		System.out.println("Introduzca un número. ");
		numero = sc.nextInt();
		
		// Realizamos un bucle 
		while (numero >= 0) {
			suma += numero;
			System.out.println("Introduzca un número. Valor negativo para salir");
			numero = sc.nextInt();
		}
		// Muestro el total
		System.out.println("El resultado es: " + suma);

		// Cierro el Scanner
		sc.close();
	}

}
