package boletin4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables para tomar el numero máximo y minimo que puede variar
		int max = 100;
		int min = 1;
		// Variable donde guardar un número
		int num;
		// Variable donde guardar la respuesta
		String respuesta;
		// Variable donde guardar la respuesta del ordenador
		Random rand = new Random();
		int random = rand.nextInt(min,max);
		
		// Scanner para ller del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido al usuario un numero
		System.out.println("Introduzca un número del 1 al 100: ");
		num = sc.nextInt();
		// Realizo un bucle donde primero pregunto si la máquina ha acertado el número y si el número es correcto se acaba y si es incorrecto pregunta si es mayor o menor hasta adivinarlo
		do {
			System.out.println("¿Es " + random + " tu número? (s/n)");
			respuesta = sc.next();
			if (respuesta.equalsIgnoreCase("s")) {
				System.out.println("¡Genial! He adivinado tu número.");
			}
			else if (respuesta.equalsIgnoreCase("n")) {
				System.out.println("¿Es tu número mayor o menor que" + random + "? (mayor/menor)");
				respuesta = sc.next();
				// Si es mayor el minimo cambia a el numero dicho por la máquina más 1
				if (respuesta.equalsIgnoreCase("mayor")) {
					min = random + 1;
				}
				// Si es menor el minimo cambia a el numero dicho por la máquina menos 1
				else if (respuesta.equalsIgnoreCase("menor")) {
					max = random - 1;
				}
				// La variable random elige números segun lo que se haya puesto antes
				random = rand.nextInt(min,max);
			}
		} while (!respuesta.equalsIgnoreCase("s"));
		
		// Cierro el scanner
		sc.close();
	}

}
