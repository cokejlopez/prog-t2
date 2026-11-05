package unidad02;

import java.util.Scanner;

public class act2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		long numero = sc.nextLong();
		int contador = 0;
		long suma = 0;
		
		while (numero > 0) {
			long digito = numero % 10;
			
			if (digito % 2 == 0) {
				contador ++;
				suma = suma + digito;
				
			}
			numero = numero / 10;
		}
		
		System.out.printf("Tu numero tiene %d digitos pares y la suma de estos da %d.\n", contador, suma);

	}

}
