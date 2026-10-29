package unidad02;

import java.util.Scanner;

public class Diapositiva25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int suma = 0;
		double promedio;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Introduce un numero: ");
			n = sc.nextInt();
			suma = suma + n;
		}
		
		promedio = suma / 10;
		System.out.printf("La media de tus números es %.2f\n", promedio);
		
	}

}
