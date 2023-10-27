package boletin5;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variable donde guarda un número
		int num = 0;
		
		// Variable donde guarda un número
		long mult = 1;
		
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		for (int i = num; i > 0; i--) {
			mult = mult*i;
			
		}
		System.out.println("El número factorial de " + num + " es " + mult);
	}

}
