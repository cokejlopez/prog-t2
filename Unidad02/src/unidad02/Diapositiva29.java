package unidad02;

import java.util.Scanner;

public class Diapositiva29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		int num = sc.nextInt();
		int factor = 1;
		
		for (int i = 1; i <= num; i++) {
			factor = factor * i;
		}
		System.out.printf("Su factor es %d\n", factor);

	}

}
