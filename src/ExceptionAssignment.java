
/*
 * Add Exception Handling to the following code to handle if 
 * the user tries to enter zero as the second integer.
 */
import java.util.Scanner;

class Division {
	public static void main(String[] args) {

		int a, b, result;

		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Input two integers");

			a = input.nextInt();

			b = input.nextInt();

			result = a / b;

			System.out.println("Result = " + result);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: Invalid divde by 0");
		} finally {
		    System.out.println("finally block will execute.");
		}
		System.out.println("After the Finally Block ...");


	}
}
