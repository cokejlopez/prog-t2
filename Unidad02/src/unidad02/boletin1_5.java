package unidad02;

import java.util.Scanner;

public class boletin1_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double mediaImpares = 0;
		int sumaImpares = 0;
		int mayorPares = 0;
		int contador = 0;
		int numero;
		int contImpar = 0;
		
		do {
			System.out.println("Introduzca un número (0 para salir): ");
			numero = sc.nextInt();
			if (numero != 0) {
				contador ++;
				
				if (numero % 2 != 0) {
					sumaImpares = sumaImpares + numero;
					contImpar ++;
				} else {
					if (numero > mayorPares) {
						mayorPares = numero;
					}
				}
			}
			
		} while (numero != 0);
		
		if (contImpar == 0) {
			System.out.println("No has introducido ningun impar.");
		} else {
			mediaImpares = sumaImpares / contImpar;
			System.out.printf("La media de tus impares es de %.2f.\n", mediaImpares);
		}

		
	}

}
