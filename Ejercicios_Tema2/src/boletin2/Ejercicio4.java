package boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Variable donde guardar la respuesta de usuario
		String respuesta1;
		String respuesta2;
		int a = 0;
		int b = 0;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido al usuario que introduzca cuanto le ha salido en cada tirada
		System.out.println("¿Qué números le ha salido en cada tirada?     [UNO] [DOS] [TRES] [CUATRO] [CINCO] [SEIS]");
		respuesta1 = sc.next();
		respuesta2 = sc.next();
		
		// Paso las cadenas a números
		switch (respuesta1) {
		case "UNO" -> 
			a = 1;
			
		case "DOS" -> 
			a = 2;
			
		case "TRES" -> 
			a = 3;
			
		case "CUATRO" -> 
			a = 4;
			
		case "CINCO" -> 
			a = 5;
			
		case "SEIS" -> 
			a = 6;
		default ->{
			System.out.println("Número incorrecto.");}
		}
		
		switch (respuesta2) {
		case "UNO" -> 
			b = 1;
			
		case "DOS" -> 
			b = 2;
			
		case "TRES" -> 
			b = 3;
			
		case "CUATRO" -> 
			b = 4;
			
		case "CINCO" -> 
			b = 5;
			
		case "SEIS" -> 
			b = 6;
		default ->{
			System.out.println("Número incorrecto.");}
		}
		
		// Realizo la suma de los dos números y muestro el resultado
		System.out.println("El resultado es: " + (a+b));
		
		
	}

}
