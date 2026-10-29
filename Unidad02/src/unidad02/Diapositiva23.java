package unidad02;

import java.util.Scanner;

public class Diapositiva23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Hasta que número quieres contar?: ");
		int numero = sc.nextInt();
		
		for(int i=0; i != numero; i++) {
			System.out.println(i);
		}
		System.out.println(numero);

	}

}
