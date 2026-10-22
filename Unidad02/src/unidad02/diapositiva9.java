package unidad02;

import java.util.Scanner;

public class diapositiva9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador = 1;
		int suma = 0; 
		
		while (contador <= 10) {
			System.out.println("Introduze un numero");
			int numero = sc.nextInt();
			suma = suma + numero;
			contador ++;
		}
		
		int promedio = suma / 10;
		System.out.printf("El promedio de sus sumas es de %d \n", promedio);

	}

}
