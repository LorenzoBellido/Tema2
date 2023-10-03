package ejerciciost2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Variable donde guardar el número decimal
		double numero;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número 
		System.out.println("Introduzca un número: ");
		// Leemos el número del teclado
		numero = sc.nextDouble();
		
		// Realizamos la condicional para ver si el número es un casi-cero	intervalo entre (1,-1)
		if((numero<0&&numero>-1)|| (numero>0&&numero<1)) {
			System.out.println("El número es un casi cero.");
		}
		else {
			System.out.println("El número no es un casi cero.");
		}
		// Cierro el Scanner
		sc.close();
		

	}

}
