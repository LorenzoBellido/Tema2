package boletin5;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Varaible donde guardar el número n
		int n;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número al usuario
		System.out.println("¿Hasta que número quieres que cuente?");
		n = sc.nextInt();
		
		// Bucle for que cuenta de 1 en 1 hasta llegar a n
		for(int i = 1; i <= n; i++) {
			System.out.print(i + ",");
		}

		// Cierro el Scanner
		sc.close();
	}

}
