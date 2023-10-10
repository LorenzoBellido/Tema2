package boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Variable donde guardar la respuesta de usuario
		String respuesta1;
		String respuesta2;
		int dado1 = 0;
		int dado2 = 0;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido al usuario que introduzca cuanto le ha salido en cada tirada
		System.out.println("¿Qué números le ha salido en cada tirada?     [UNO] [DOS] [TRES] [CUATRO] [CINCO] [SEIS]");
		respuesta1 = sc.next();
		respuesta2 = sc.next();
		
		// Paso las cadenas a números y los guardo en cada variable
		switch (respuesta1) {
		case "UNO" -> 
			dado1 = 1;
			
		case "DOS" -> 
			dado1 = 2;
			
		case "TRES" -> 
			dado1 = 3;
			
		case "CUATRO" -> 
			dado1 = 4;
			
		case "CINCO" -> 
			dado1 = 5;
			
		case "SEIS" -> 
			dado1 = 6;
		default ->{
			System.out.println("Número incorrecto.");}
		}
		
		switch (respuesta2) {
		case "UNO" -> 
			dado2 = 1;
			
		case "DOS" -> 
			dado2 = 2;
			
		case "TRES" -> 
			dado2 = 3;
			
		case "CUATRO" -> 
			dado2 = 4;
			
		case "CINCO" -> 
			dado2 = 5;
			
		case "SEIS" -> 
			dado2 = 6;
		default ->{
			System.out.println("Número incorrecto.");}
		}
		
		// Realizo la suma de los dos números y muestro el resultado
		System.out.println("El resultado es: " + (dado1+dado2));
		
		
	}

}
