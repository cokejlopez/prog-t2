package unidad02;

import java.util.Scanner;

public class act2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una palabra: ");
		String palabra = sc.next();
		
		String cadena = "";
		String c = "";

		for (int i=0; i<palabra.length(); i++) {
			c = palabra.substring(i, i+1);
			
			if(c.toLowerCase().equals(c)) {
			cadena = cadena + c.toUpperCase();
		} else {
			cadena = cadena + c.toLowerCase();
		}
		
		 
		}
		
		System.out.printf("Su palabra invertida es: %s \n", cadena);
		
	}

}
