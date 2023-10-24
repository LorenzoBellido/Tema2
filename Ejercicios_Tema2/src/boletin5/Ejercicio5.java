package boletin5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variable donde introducir un número
		int n;
		int media = 0;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i != 10; i++) {
				System.out.println("Introduce 10 números");
				n = sc.nextInt();
				media += n;
		}
		
		media = media/10;
		System.out.println("La media es: " + media);
		

	}

}
