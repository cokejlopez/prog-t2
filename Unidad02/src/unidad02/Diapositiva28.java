package unidad02;

import java.util.Scanner;

public class Diapositiva28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = sc.nextInt();
		
		while (numero > 0) {
			int unidad = numero % 10;
			System.out.println(unidad);
			numero = numero / 10;
		}

	}

}
