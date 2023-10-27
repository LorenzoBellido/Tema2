package boletin5;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Variable donde guardar las calificaciones
		int calificaciones;
		
		// Variable donde guardar los suspensos
		int suspenso = 0;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i != 5; i++) {
			System.out.println("Introduzca sus calificaciones: ");
			calificaciones = sc.nextInt();
			if(calificaciones >= 0) {
				if(calificaciones < 5)
					suspenso++;
			}
			else {
				System.out.println("No introduzca números negativos.");
			}
		}
		System.out.println("Has suspendido: " + suspenso);
		// Cierro el Scanner
		sc.close();
		
	}

}
