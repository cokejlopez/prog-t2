package unidad02;

public class Boletin3recursivo {

	public static void main(String[] args) {
		long f = fibonacci(23);
		System.out.println(f);

	}

	public static int fibonacci(long n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
