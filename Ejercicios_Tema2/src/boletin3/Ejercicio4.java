package boletin3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variable donde guardar el numero introducido
		int numero;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido al ususario un número
		System.out.println("Introduzca un número.");
		numero = sc.nextInt();
		
		// Realizo un bucle
		while (numero!=0) {
			if (numero%2 == 0) {
				System.out.println("Su número es par");
			}
			else {
				System.out.println("Su número es impar");
			}
			System.out.println("Intoduzca un número. 0 Para salir.");
			numero = sc.nextInt();
		}

		// Cierro el Scanner
		sc.close();
	}

}
