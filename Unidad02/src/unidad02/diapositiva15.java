package unidad02;

import java.util.Scanner;

public class diapositiva15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String vocal = "";
		
		do {
			System.out.println("Introduce una letra (vocal para salir)");
			vocal = sc.next();
		} while (vocal != "a" || vocal != "e" || vocal != "i" || vocal != "o" || vocal != "u" || vocal != "A" || vocal != "E" || vocal != "I" || vocal != "O" || vocal != "U");
		
		System.out.println("Has introducido una vocal: " + vocal);

	}

}
