package boletin3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variable donde guardar la suma
		int suma = 0;
		// Variable donde guardar el numero introducido
		int numero;
		// Variable donde guardar la cantidad de numeros introducidos
		int cantidad = 0;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número al usuario
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		
		
		// Bucle para realizar las sumas
		while (numero >= 0) {
			suma += numero;
			cantidad++;
			System.out.println("Introduzca un número para sumar. Valor negativo para salir.");
			numero = sc.nextInt();
		}
		// Muestro la media
		System.out.println("La media es: " + suma/cantidad);
		
		// Cierro el Scanner
		sc.close();
	
	}
}
