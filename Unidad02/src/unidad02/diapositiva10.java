package unidad02;

import java.util.Scanner;

public class diapositiva10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 1;
		
		while (numero != 0) {
			System.out.println("Introduzca un numero (0 para salir): ");
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				System.out.printf("El numero %d es par.\n", numero);
			} else {
				System.out.printf("El numero %d no es par.\n", numero);
			}
		}

	}

}
