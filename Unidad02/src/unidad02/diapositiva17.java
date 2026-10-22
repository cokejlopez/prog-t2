package unidad02;

import java.util.Scanner;

public class diapositiva17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int suma = 0;
		do {
			System.out.println("Introduce un numero: ");
			int numero = sc.nextInt();
			suma = suma + numero;
			contador = contador + 1;
			} while (contador < 10);
		
		int promedio = suma / 10;
		System.out.printf("La suma de tus numeros es de %d, y el promedio es de %d.\n", suma, promedio);

	}

}
