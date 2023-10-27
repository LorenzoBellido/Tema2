package boletin5;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variable donde guaradar el total de los números impares
		int suma = 0;
		
		// Bucle dodne cuento del uno al 20 para coger los 10 primeros números imparews
		for (int i = 1; i != 20;i++){
			if (i % 2 != 0) {
				suma += i;
			}
		}
		// Imprimo el resultado
		System.out.println("La suma de los 10 primeros números impares es: " + suma);
	}

}
