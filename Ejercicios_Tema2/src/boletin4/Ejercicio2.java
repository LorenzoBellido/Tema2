package boletin4;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variable donde guardar un número
		int numero = 1;
		
		// Bucle que comprueba si un número entre el 1 y el 200 es par o no. Si es par se muestra
		do {
			if (numero % 2 == 0) {
				System.out.print(numero + ",");
				numero++;
			}
			else {
				numero++;
			}
		}while (numero > 0 && numero <= 200);

	}

}
