package boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Variable donde guardar la respuesta del usuario
		String respuesta;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido el tipo de carnet al usuario
		System.out.println("¿Cuál es su tipo de carnet?  [E][D][C1-C5][A][B1-B2]");
		respuesta = sc.next();
		
		// Hago las condicionales paraa ver el tipo de carnet
		switch (respuesta) {
		case "E" ->
			System.out.println("Su carnet es de remolques.");
		case "D" ->
		System.out.println("Su carnet es de autobuses.");
		case "C1","C2","C3","C4","C5" ->
		System.out.println("Su carnet es de camiones.");
		case "A" ->
		System.out.println("Su carnet es de motocicletas.");
		case "B1","B2" ->
		System.out.println("Su carnet es de automóviles.");
		default -> {
			System.out.println("Categoría no contemplada");
			}
		}
		
	// Cierro el scanner
		sc.close();
	}

}
