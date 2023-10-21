package boletin4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variable donde guardar el número del usuario
    	int n;
    // Variable donde guardar el primer número de la suma
    	int numero = 1;
    // Variable donde guardar el total
    	int total = 0;
    // Scanner para leer del teclado
    	Scanner sc = new Scanner(System.in);
    	
    // Pido al usuario un número
    	System.out.print("Introduce un número: ");
        n = sc.nextInt();
    // Realizo el bucle donde se sumará a número el total y numero valdrá 1 más
        do {
        	total += numero;
        	numero++;
        } while (numero <= n);
        
    // Muestro el resultado
        System.out.println("La suma de los números desde 1 hasta " + n + " es: " + total);

    // Cierro el Scanner
    sc.close();
	}

}
