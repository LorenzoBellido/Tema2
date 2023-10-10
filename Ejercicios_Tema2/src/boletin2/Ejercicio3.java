package boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Constantes de cada respuesta
		final int SUMAR = 1;
		final int RESTAR = 2;
		final int MULTIPLICAR = 3;
		final int DIVIDIR = 4;
		
		// Variable donde guardar la respuesta del usuario
		int num1;
		int num2;
		int respuesta;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido 2 números
		System.out.println("Introduzca 2 números:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// Pido al usuario que seleccione una opción
		System.out.println("Elija una opción: SUMAR [1]  RESTAR [2]  MULTIPLICAR [3]  DIVIDIR [4]");
		respuesta = sc.nextInt();
		
		// Realizo las condicionales y muestro el resultado segun el caso escogido
		
		switch (respuesta) {
		case 1 ->{
			System.out.println(num1 + num2);}
		
		case 2 ->{
			System.out.println(num1 - num2);}
	
		case 3 ->{
			System.out.println(num1 * num2);}

		case 4 ->{
			System.out.println(num1 / num2);}
		default ->{
			System.out.println("Número incorrecto.");}
		}
		// Cierro el Scanner
		sc.close();

	}

}
