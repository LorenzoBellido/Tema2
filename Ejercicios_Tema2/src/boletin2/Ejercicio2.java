package boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Variable donde guardar num1
		int dia;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido una nota entera
		System.out.println("Introduzca su nota:");
		dia = sc.nextInt();
		
		// Compruebo cada caso con la variable introducida
		switch (dia) {
		case 1 ->
			System.out.println("Lunes.");
		case 2 ->
		System.out.println("Martes.");
		case 3 ->
		System.out.println("Miércoles.");
		case 4 ->
		System.out.println("Jueves.");
		case 5 ->
		System.out.println("Viernes.");
		case 6 ->
		System.out.println("Sábado.");
		case 7 ->
		System.out.println("Domingo.");
		default-> 
			System.out.println("Día Incorrecto");
		
		}
		
		// Cierro el Scanner
		sc.close();
		
	}

}
