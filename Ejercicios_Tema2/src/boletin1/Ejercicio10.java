package boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Variable donde guardar el numero 1
		int num1;
		// Variable donde guardar el numero 2
		int num2;
		// Variable donde guardar el numero 3
		int num3;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos tres números
		System.out.println("Introduzca 3 números: ");
		// Leemos los números del teclado
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		// Realizamos las condicionales corresponsientes para saber si un número es el resultado de la suma de los dos restantes
		if ((num1 + num2) == num3) {
			System.out.println("La suma del 1º número más el 2º da como resultado el 3º número.");
		}
		else if ((num1 + num3) == num2){
			System.out.println("La suma del 1º número más el 3º da como resultado el 2º número.");
		}
		else if ((num2 + num1) == num3){
			System.out.println("La suma del 2º número más el 1º da como resultado el 3º número.");
		}
		else if ((num2 + num3) == num1){
			System.out.println("La suma del 2º número más el 3º da como resultado el 1º número.");
		}
		else if ((num3 + num1) == num2){
			System.out.println("La suma del 3º número más el 1º da como resultado el 2º número.");
		}
		else if ((num3 + num2) == num1){
			System.out.println("La suma del 3º número más el 2º da como resultado el 1º número.");
		}
		else {
			System.out.println("Ningún número es el resultado de la suma de los restantes.");
		}
		
		// Cierro el Scanner
		sc.close();

	}

}
