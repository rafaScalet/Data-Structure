package exercise;

public class Fibonacci {
	public static void generate (int quantity) {
		generate(quantity, 0, 1);
	}

	private static void generate (int quantity, int first, int second) {
		if (quantity <= 0 ) {
			return;
		}

		System.out.print(first + ", ");
		generate(quantity - 1, second, first + second);
	}

	public static void main(String[] args) {
		generate(6);
	}
}
