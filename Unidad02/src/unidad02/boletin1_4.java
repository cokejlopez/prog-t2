package unidad02;

import java.util.Scanner;

public class boletin1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la cantidad de numeros que desea introducir: ");
		int cant = sc.nextInt();
		
		int mayores = 0;
		int menores = 0;
		int iguales = 0;
		
		for (int i = 1; i <= cant; i++) {
			System.out.printf("Introduzca el %d numero: \n", i);
			int numero = sc.nextInt();
			
			if (numero > 0) {
				mayores ++;
			} else if(numero < 0) {
				menores ++;
			} else {
				iguales ++;
			}
		}
		
		System.out.printf("Has introducido %d numeros mayores a 0.\n", mayores);
		System.out.printf("Has introducido %d numeros menores a 0.\n", menores);
		System.out.printf("Has introducido %d numeros iguales a 0.\n", iguales);

	}

}
