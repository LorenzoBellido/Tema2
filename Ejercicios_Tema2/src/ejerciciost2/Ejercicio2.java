package ejerciciost2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variable para guardar el número1 entero
		int numero1;
		// Variable para guardar el número2 entero
		int numero2;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido undos números 
		System.out.println("Introduzca dos número: ");
		// Leemos los numeros del teclado
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		// Realizar la condicional para ver si los números son iguales
		if(numero1==numero2) {
			System.out.println("Los números son iguales");
			}
		else {
			System.out.println("Los números no son iguales");
			}
		// Cierro el Scanner
		sc.close();
	}

}
