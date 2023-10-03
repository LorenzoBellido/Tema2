package ejerciciost2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variable para guardar el número1 entero
		int numero1;
		// Variable para guardar el número2 entero
		int numero2;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido dos números
		System.out.println("Introduzca dos números:");
		// Leemos los números del teclado
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		// Crear la condición para mostrarlos ordenados de menor a mayor
		if (numero1<numero2){
			System.out.println(numero1 + "<" + numero2);
		}
		else {
			System.out.println(numero2 + "<" + numero1);
		}
		
		// Cierro el Scanner
		sc.close();

	}

}
