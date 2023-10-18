package boletin3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variable donde guardar un numero
		int numero = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Random
		Random rand = new Random();
		int random = rand.nextInt(1,101);

		// Pido al usuario un número entre el 1 y el 100
		System.out.println("Introduzca un número del 1 al 100");
		numero = sc.nextInt();

		// Creo un bucle el cual acabara cuando acierte el numero o ponga un valor negativo
		while (numero != random  && numero > 0){
			// La consola muestra si el numero introducido es menor
			if(numero > random) {
				System.out.println("El número es menor");

			}
			// La consola muestra si el numero introducido es mayor
			else if (numero < random) {
				System.out.println("El número es mayor");

			}
			System.out.println("Introduzca un número del 1 al 100");
			numero = sc.nextInt();

		}
		// Condicion que muestra cuando un jugador se rinde introduciendo un número negativo
		if (numero < 0) {
			System.out.println("Te has rendido");
		}
		// Condición que se muestra cuando aciertas el número
		else {
			System.out.println("Has ganado");
		}

		// Cierro el Scanner
		sc.close();
	}

}
