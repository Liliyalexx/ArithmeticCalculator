
package pack1;
import java.util.Scanner;

public class Calc {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1;
		double num2;
		System.out.println("Enter the first number:");
		num1 = scan.nextDouble();
		System.out.println("Enter the second number:");
		num2 = scan.nextDouble();
		System.out.println("Addidtion: " + (num1 + num2));
		System.out.println("Subtraction: " + (num1 - num2));
		System.out.println("Multiplication: " + (num1 * num2));
		System.out.println("Division: " + (num1 / num2));
		

	}

}
