package unidad02;

import java.util.Scanner;

public class diapositiva18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        int aciertos = 0;
        int numero1, numero2, resultadoCorrecto, respuesta;
 
        System.out.println("=== Juego de cálculo mental: SUMAS ===");
        System.out.println("Introduce el resultado de cada suma. El juego termina en cuanto falles.\n");
 
        do {
            numero1 = (int) (Math.random() * 100) + 1;
            numero2 = (int) (Math.random() * 100) + 1;
            resultadoCorrecto = numero1 + numero2;
 
            System.out.print(numero1 + " + " + numero2 + " = ");
            respuesta = sc.nextInt();
 
            if (respuesta == resultadoCorrecto) {
                aciertos++;
                System.out.println("¡Correcto! Llevas " + aciertos + " acierto(s).\n");
            } else {
                System.out.println("Incorrecto. El resultado era " + resultadoCorrecto + ".");
            }
 
        } while (respuesta == resultadoCorrecto);
 
        System.out.println("\nFin del juego. Operaciones correctas realizadas: " + aciertos);
 
        sc.close();
    }
}