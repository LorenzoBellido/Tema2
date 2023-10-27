package boletin5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Variable donde guardar un número
		int n;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número el cual será el maximo de los multiplos de 3
		System.out.println("Introduzce un número: ");
		n = sc.nextInt();
		
		// Bucle donde sumo de uno en uno hasta llegar a n y cuando sea multiplo de 3 se imprima
		for(int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.println(i + "es un multiplo de 3");
			}
		}
		
		// Cierro el Scanner
		sc.close();
	}

}
