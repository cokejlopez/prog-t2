package unidad02;

public class Boletin3recursivo {

	public static void main(String[] args) {
		int fact = factorial(5);
		System.out.println(fact);
		
		int div = division(20, 2);
		System.out.println(div);

	}

	public static int fibonacci(long n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} 
		
		return n * factorial (n - 1);
	}
	
	public static int division(int dividendo, int divisor) {
		if (dividendo < divisor) {
			return 0;
		}
		return 1 + division(dividendo - divisor, divisor);
		
	}
	
	public static int volteaRec(int n) {
		if (n < 10) {
			return n;
		}
		int cifras;
		int dig = n % 10;
		int volteado = dig * 10;
		return volteaRec(n / 10);
	}
}
