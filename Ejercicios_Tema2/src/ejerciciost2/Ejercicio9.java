package ejerciciost2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Creamos las constantes PIEDRA, PAPEL y TIJERAS con valores enteros 
		final int PIEDRA = 1;
		final int PAPEL = 2;
		final int TIJERAS = 3;

		// Declaramos las variables donde guardaremos las jugadas de los jugadores
		int jugador1, jugador2;

		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al jugador 1 que elija una opción
		System.out.println("Jugador 1: Elija PIEDRA [1], PAPEL [2] o TIJERAS [3]");
		jugador1 = sc.nextInt();

		// Le pedimos al jugador 2 que elija una opción
		System.out.println("Jugador 2: Elija PIEDRA, PAPEL o TIJERAS");
		jugador2 = sc.nextInt();

		// Comprobamos que los valores introducidos son correctos
		if (jugador1 < 1 || jugador1 > 3) {
			System.out.println("Jugador 1: No ha introducido un valor válido");
		} else if (jugador2 < 1 || jugador2 > 3) {
			System.out.println("Jugador 2: No ha introducido un valor válido");

			// Si los valores introducidos son correctos, hacemos las distintas
			// comprobaciones
		} else { // Si los dos jugadores han introducido los mismos valores, entonces empatan
			if (jugador1 == jugador2) {
				System.out.println("EMPATE");
			} else if (jugador1 == PIEDRA && jugador2 == TIJERAS 
					|| jugador1 == TIJERAS && jugador2 == PAPEL
					|| jugador1 == PAPEL && jugador2 == PIEDRA) {
				// Si jugador1 juega PIEDRA y el jugador2 TIJERAS, gana el jugador 1
				// Si jugador1 juega TIJERAS y el jugador2 PAPEL, gana el jugador 1
				// Si jugador1 juega PAPEL y el jugador2 PIEDRA, gana el jugador 1
				System.out.println("Gana el Jugador 1");
			} else { // En cualquier otro caso, gana el jugador 2
				System.out.println("Gana el Jugador 2");
			}
		}

		sc.close();
	}
}