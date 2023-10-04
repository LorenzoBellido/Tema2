package ejerciciost2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Constantes donde guardar Piedra, papel y tijeras
		final String PIEDRA = "piedra";
		final String PAPEL = "papel";
		final String TIJERAS = "tijeras";
		
		// Variables donde guardar la respuesta de cada jugador
		String jugador1;
		String jugador2;
		
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos una respuesta a los usuarios
		System.out.println("Elija piedra, papel o tijeras: ");
		// Leemos el teclado
		jugador1 = sc.next();
		jugador2 = sc.next();
		
		// Realizamos las condicionales (piedra>tijera),(papel>piedra) y (tijera>papel)
		if ((jugador1PIEDRA)&&(jugador2TIJERAS)) {
			System.out.println("Gana el jugador 1.");
		}
		else {
			System.out.println("GG");
		}

	}

}
