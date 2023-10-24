package boletin4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variable donde guardar la respuesta de cada jugador
		String jugador1, jugador2;
		String respuesta;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Jugador uno elija una opción: [PIEDRA], [PAPEL] o [TIJERA]");
			jugador1 = sc.next();
			while (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERA")) {
                System.out.println("Opción no válida. Introduce [PIEDRA], [PAPEL] o [TIJERA].");
                jugador1 = sc.nextLine().toUpperCase();
            }
			System.out.println("Jugador dos elija una opción: [PIEDRA], [PAPEL] o [TIJERA]");
			jugador2 = sc.next();
			while (!jugador2.equals("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERA")) {
                System.out.println("Opción no válida. Introduce [PIEDRA], [PAPEL] o [TIJERA].");
                jugador2 = sc.nextLine().toUpperCase();
		}
			if (jugador1.equals(jugador2)) {
				System.out.println("Empate");
			}
			else if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")) || (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA")) || (jugador1.equals("TIJERA") && jugador2.equals("PAPEL"))) {
                System.out.println("Gana Jugador 1.");
            } else {
                System.out.println("Gana Jugador 2.");
            }
			 System.out.println("¿Quieres seguir jugando? (S/N)");
	         respuesta = sc.nextLine();
		}while(respuesta.equals("S"));
	}

}
