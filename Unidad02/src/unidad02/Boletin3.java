package unidad02;

public class Boletin3 {

	public static void main(String[] args) {
		int dig = digitos(8736);
		System.out.printf("Su numero de dígitos es %d\n", dig);
		
		int volt = voltea(0);
		System.out.printf("Su numero de volteado  es %d\n", volt);

	}

	public static int digitos(int n) {
		int contador = 0;
		if (n == 0) {
			contador = 1;
		}
		while (n > 0) {
			contador ++;
			n = n / 10;
		}
		return contador;
	}
	
	public static int voltea(int n) {
		int resultado = 0;
		int digito;
		
		while (n > 0) {
			digito = n % 10;
			resultado = (resultado * 10) + digito;
			n = n / 10;
		}
		return resultado;
	}
}
