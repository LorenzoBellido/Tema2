package boletin1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Variable donde guardar el numeroç
		float nota;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un número
		System.out.println("Introduzca su nota: ");
		// Leemos la ntota del teclado
		nota = sc.nextFloat();
		
		// Con las condicionales comprobamos si el número está entre el 0 y el 10 (0 y 10 inclusive) y mostramos el resultado
		if (nota<0 || nota>10) {
			System.out.println("Nota incorrecta.");
		}
		else if (nota<5) { 
			System.out.println("Tienes un insuficiente.");
		}
		else if (nota<6) { 
			System.out.println("Tienes un suficiente.");
		}
		else if (nota<7) { 
			System.out.println("Tienes un bien.");
		}
		else if (nota<9) { 
			System.out.println("Tienes un notable.");
		}
		else { 
			System.out.println("Tienes un sobresaliente.");
		}

		// Cierro el Scanner
		sc.close();
	}

}
