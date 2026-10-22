package unidad02;

import java.util.Scanner;

public class diapositiva9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int suma = 0; 
		
		while (contador <= 9) {
			System.out.println("Introduze un numero");
			int numero = sc.nextInt();
			suma = suma + numero;
			contador ++;
		}
		
		int promedio = suma / 10;
		System.out.printf("La suma de los numeros es %d y el promedio de sus sumas es de %d. \n", suma, promedio);

	}

}
