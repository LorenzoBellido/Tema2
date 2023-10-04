package ejerciciost2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Variable donde guardar el número
		int numero;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un número
		System.out.println("Introduzca un número comprendido entre 0 y 99.999: ");
		// Leemos el número del teclado
		numero = sc.nextInt();
		
		// Primero comprobamos si el número está en el intervalo 0 - 99.999 y hacemos las operaciones mostrando el resultado
		if (numero<0 || numero>99999) {
			System.out.println("El número no se encuentra en el intervalo indicado: ");
		}
		else if (numero<10) {
			System.out.println("El número tiene 1 cifra");
		}
		else if (numero<100) {
			System.out.println("El número tiene 2 cifra");
		}
		else if (numero<1000) {
			System.out.println("El número tiene 3 cifra");
		}
		else if (numero<10000) {
			System.out.println("El número tiene 4 cifra");
		}
		else {
			System.out.println("El número tiene 5 cifra");
		}
		
	// Cierro el Scanner
	sc.close();

	}

}
