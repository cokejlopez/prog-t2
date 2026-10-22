package unidad02;

import java.util.Scanner;

public class diapositiva16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;
		
		do {
			System.out.println("Introduzca el primer numero (iguales para salir)");
			numero1 = sc.nextInt();
			System.out.println("Introduzca el segundo numero (iguales para salir)");
			numero2 = sc.nextInt();
		} while (numero1 != numero2);
		
		System.out.printf("El numero %d es igual al numero %d.\n", numero1, numero2);

	}

}
