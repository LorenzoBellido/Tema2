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
		int random = rand.nextInt(1,11);
		
		// Pido al usuario un número entre el 1 y el 100
		System.out.println("Introduzca un número del 1 al 100");
		numero = sc.nextInt();
		
		while (numero != random && numero < 0){
			if(numero>random) {
				System.out.println("El número es menor");
				
			}
			else if (numero<random) {
				System.out.println("El número es mayor");
				
			}
			System.out.println("Introduzca un número del 1 al 100");
			numero = sc.nextInt();
			
		}
		if (numero < 0) {
			System.out.println("Has perdido");
		}
		else {
			System.out.println("Has ganado");
		}
		
		
		// Cierro el Scanner
		sc.close();
	}

}
