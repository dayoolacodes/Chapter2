//Exercise2.15
import java.util.Scanner;

public class ClassExercise4{
	public static void main (String [] args){

		Scanner input = new Scanner(System.in);
		System.out.print("\n Enter First Number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter Second Number: ");
		int secondNumber = input.nextInt();

		int sum = firstNumber + secondNumber;
		int product = firstNumber * secondNumber;
		int difference = firstNumber - secondNumber;
		int quotient = firstNumber / secondNumber;
		System.out.printf("The Sum is: %d%n", sum);
		System.out.printf("The Product is: %d%n", product);
		System.out.printf("The Difference is: %d%n", difference);
		System.out.printf("The Quotient is: %d%n", quotient);
		}
}
