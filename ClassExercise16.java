//Exercise2.32
import java.util.Scanner;

public class ClassExercise16{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter any Digit: ");
		int Digit1 = input.nextInt();
	
		System.out.print("Enter any New Digit: ");
		int Digit2 = input.nextInt();

		System.out.print("Enter any New Digit: ");
		int Digit3 = input.nextInt();

		System.out.print("Enter any New Digit: ");
		int Digit4 = input.nextInt();
	
		System.out.print("Enter any Last Digit: ");
		int Digit5 = input.nextInt();
	
		int zeroCounter = 0;
		int positiveCounter = 0;
		int negativeCounter = 0;

		if (Digit1 > 0){positiveCounter++;}
		if (Digit2 > 0){positiveCounter++;}
		if (Digit3 > 0){positiveCounter++;}
		if (Digit4 > 0){positiveCounter++;}
		if (Digit5 > 0){positiveCounter++;}
		if (Digit1 < 0){negativeCounter++;}
		if (Digit2 < 0){negativeCounter++;}
		if (Digit3 < 0){negativeCounter++;}
		if (Digit4 < 0){negativeCounter++;}
		if (Digit5 < 0){negativeCounter++;}
		if (Digit1 == 0){zeroCounter++;}
		if (Digit2 == 0){zeroCounter++;}
		if (Digit3 == 0){zeroCounter++;}
		if (Digit4 == 0){zeroCounter++;}
		if (Digit5 == 0){zeroCounter++;}
		System.out.printf("The are %d zeros %d positive numbers and %d negative numbers", zeroCounter, positiveCounter, negativeCounter);
	}
}