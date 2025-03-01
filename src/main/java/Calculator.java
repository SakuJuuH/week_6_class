public class Calculator {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static double divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Division by zero is not allowed");
		}
		return (double) a / b;
	}
}