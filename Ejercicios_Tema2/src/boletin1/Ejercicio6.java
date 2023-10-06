package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variables donde guardar los coeficientes de una ecuación de segundo grado
		float a;
		float b;
		float c;
		float x1;
		float x2;
		
		// Scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido los coeficientes de la ecuación
		System.out.println("Introduzca los coeficientes de la ecuación: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		// Primero comprobamos si la raiz sale negativa ya que si sale negativa no tendría resultado
		if ((b*b)<(4*a*c)) {
			System.out.println("Sin resultado real.");
		}
		// Comprobamos si el coeficiente sale 0
		else if (a==0) {
			x1 = (float) (-c/b);
			System.out.println("La x es: " + x1);
		}
		// Si no es negativa y su coeficiente no es 0 realizamos la operación de segundo grado
		else {
			// Muestro ambas soluciónes 
			x1 = (-b + (float)Math.sqrt((b*b)-(4*a*c)))/(2*a);
			System.out.println("La x 1 es: " + x1);
			x2 = (-b - (float)Math.sqrt((b*b)-(4*a*c)))/(2*a);
			System.out.println("La x 2 es: " + x2);
		}
		
		// Cierro el Scanner
		sc.close();
		
	}

}
