public class JavaCalculator {
	public static void main(String[] args) {
		//testing the calculator:
		int add = JavaCalculator.add(2, 2);
		System.out.println(add);
		
		int subtract = JavaCalculator.subtract(5, 2);
		System.out.println(subtract);
		
		int mult = JavaCalculator.mult(3, 5);
		System.out.println(mult);
		
		int div = JavaCalculator.div(8, 2);
		System.out.println(div);
		
		int square = JavaCalculator.square(5, 6);
		System.out.println(square);

	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public static int mult(int num1, int num2) {
		return num1 * num2;
	}

	public static int div(int num1, int num2) {
		return num1 / num2;
	}

	public static int square(int num1, int num2) {
		return num1 * num1;
	}
}
