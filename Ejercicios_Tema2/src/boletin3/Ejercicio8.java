package boletin3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Variable donde guardar la altura
		int altura = 0;
		int mayor = 0;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Bucle donde se comprueba que la altura no sea negativa
		while (altura >= 0) {
			//Condicional que hace que si la altura es mayor que la variable la guarde en la variable mayor
			if (altura >= mayor) {
				mayor = altura;
			}
			
			// Pido un número al usuario
			System.out.println("Introduzca la altura del árbol en centímetros: ");
			altura = sc.nextInt();
		}
		// Muestro el árbol más grande
		System.out.println("El árbol más grande mide: " + mayor);
		
		// Cierro el Scanner
		sc.close();
	}

}
