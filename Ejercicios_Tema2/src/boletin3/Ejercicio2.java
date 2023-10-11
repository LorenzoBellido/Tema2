package boletin3;

import java.util.Scanner;

public class Ejercicio2 {

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
			if (numero > 0) {
			suma++;
			System.out.println("Introduzca un número. Valor negativo para salir");
			numero = sc.nextInt();}
			else {
				suma += 0;
				System.out.println("Introduzca un número. Valor negativo para salir");
				numero = sc.nextInt();
			}
		}
		// Muestro la cantidad de números positivos
		System.out.println("La cantidad de números positivos es: " + suma);
		

		// Cierro el Scanner
		sc.close();
	}

}
