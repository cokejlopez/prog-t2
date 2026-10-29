package unidad02;

import java.util.Scanner;

public class Diapositiva26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Introduzca un numero de 1 a 10: ");
			n = sc.nextInt();
		} while (n < 1 || n > 10);
		System.out.printf("Tabla del %d\n", n);
		for (int i = 1; i <= 10; i++) {
			int mult = i*n;
			System.out.printf("%d X %02d = %d\n", n, i, mult);
			
		}
	}

}
