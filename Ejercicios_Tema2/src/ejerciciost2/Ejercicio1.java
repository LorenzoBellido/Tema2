package ejerciciost2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variable donde guardar el número
		int numero;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedir un número al usuario
		System.out.println("Introduzca un número: ");
		// Leemos el número del teclado
		numero = sc.nextInt();
		
		// Comprobamos si es par o impar con la condicional if y ejecutamos unas instrucciones segun el resultado
		if (numero%2 == 0) {
			System.out.println("El número es par.");
		}
		else {System.out.println("El número es impar.");
		
		// Cierro el Scanner
		sc.close();
		}

	}

}
