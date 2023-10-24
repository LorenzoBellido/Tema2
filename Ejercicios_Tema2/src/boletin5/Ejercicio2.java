package boletin5;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Bucle que empieza en 2 y muestra todos los número pares hasta 200
		for (int i = 2; (i % 2 == 0) &&(i <= 200); i+=2){
			System.out.println(i);
		}

	}

}
