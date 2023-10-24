package boletin4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variable donde guardar un número y una cantidad
		int num;
		int num2;
		int cantidad = 0;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Realizo un bucle donde pido primero un número y luego realizo las operaciones
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		do {
			cantidad++;
			num2 = num * cantidad;
		// Muestro el resultado hasta que la cantidad es mayor que 10
			System.out.println(num + "x" + cantidad + "=" + num2);
		} while (cantidad < 10);

		sc.close();
	}

}