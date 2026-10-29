package unidad02;

public class Diapositiva27 {

	public static void main(String[] args) {
		int suma = 0;
		
		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				suma = suma + i;
			}
		}
		System.out.printf("La suma de tus digitos es de %d\n", suma);

	}

}
