package ejerciciost2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Variable para guardar el número 1 entero
		int numero1;
		// Variable para guardar el número 2 entero
		int numero2;
		// Variable para guardar el número 3 entero
		int numero3;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in); 
		
		// Pido tres números
		System.out.println("Introduzca dos números:");
		// Leemos los números del teclado
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		numero3 = sc.nextInt();
		
		// Crear la condición para mostrarlos ordenados de mayor a menor
		if((numero1>numero2)&&(numero2>numero3)) {
			System.out.println(numero1 + ">" + numero2 + ">" + numero3);
		}
		else if((numero1>numero3)&&(numero3>numero2)) {
			System.out.println(numero1 + ">" + numero3 + ">" + numero2);
		}
		else if((numero2>numero1)&&(numero1>numero3)){
			System.out.println(numero2 + ">" + numero1 + ">" + numero3);
		}
		else if((numero2>numero3)&&(numero3>numero1)){
			System.out.println(numero2 + ">" + numero3 + ">" + numero1);
		}
		else if((numero3>numero1)&&(numero1>numero2)){
			System.out.println(numero3 + ">" + numero1 + ">" + numero2);
		}
		else {
			System.out.println(numero3 + ">" + numero2 + ">" + numero1);
		}
		
		// Cierro Scanner
		sc.close();

	}

}
