package boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Variable donde guardar num1
		int nota;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido una nota entera
		System.out.println("Introduzca su nota:");
		nota = sc.nextInt();
		
		// Compruebo cada caso con la variable introducida
		switch (nota) {
		case 1,2,3,4 ->
			System.out.println("Suspenso.");
		case 5 ->
		System.out.println("Suficiente.");
		case 6 ->
		System.out.println("Bien.");
		case 7,8 ->
			System.out.println("Notable.");
		case 9,10 ->
			System.out.println("Sobresaliente.");
		default-> 
			System.out.println("Nota Incorrecta");
		
		}
		
		// Cierro el Scanner
		sc.close();
		
	}

}
