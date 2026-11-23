package unidad02;

import java.util.Scanner;

public class act2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int n = sc.nextInt();
		
		int d = digitosRec(n);
		System.out.printf("Los digitos de su numero son: %d\n", d);

	}
	
	public static int digitosRec(int n) {
		if (n >= 0 && n < 10) {
			return 1;
		}
		return 1 + digitosRec(n / 10);
	}
}

