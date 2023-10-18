package boletin3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variable donde guardar un número, la suma de los numeros, la cantidad de numeros y la cantidad de numeros mayores de 18
		int numero, suma = 0 ,cantidad = 0, mayores = 0;
		
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número al ususario
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		
		// Bucle donde valoro la condición del numero negativo
		while (numero > 0) {
			if(numero >= 18) {
				mayores += 1;
			}
		suma += numero;
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		cantidad++;
		}
		
		// Muestro los resultados pedidos
		System.out.println("La media es: " + (double)suma/cantidad);
		System.out.println("El número de alumnos es: " + cantidad);
		System.out.println("El número de alumnos mayores de edad son: " + mayores);
		// Cierro el Scanner
		sc.close();

	}

}
