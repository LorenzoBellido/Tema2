package boletin5;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Variable donde guardar si es primo
		int esPrimo;
		int num;
		
		// Scanner para ller del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número al usuario
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		if(num != 1) {
			for(int i = 2; i <= num; i++) {
				if (num % i == 0) {
					esPrimo = 1;
				}
			}
		}else {
			esPrimo = 1;
		}
		
		// Muestro si el número es primo o no
		if(esPrimo == 1) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		
		// Cierro el Scanner
		sc.close();

	}

}
