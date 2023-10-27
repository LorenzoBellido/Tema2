package boletin5;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Variable donde guardar los números A y B
		int a,b;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido una variable al usuario
		System.out.println("Introduzca un número: ");
		a = sc.nextInt();
		System.out.println("Introduzca un número mayor al primer número: ");
		b = sc.nextInt();
		
		for (int i = a; i <= b; i++) {
		System.out.print(i + " ");
			}
		
		// Cierro el Scanner	
		sc.close();
	}

}
