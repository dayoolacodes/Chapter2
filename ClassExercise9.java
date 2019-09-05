//Exercise2.25
import java.util.Scanner;

public class ClassExercise9{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter Digit to check if Even or Odd: ");
		int checkNumber= input.nextInt();

		if (checkNumber % 2 == 0) {
			System.out.print("The Number is Even");}
		if(checkNumber % 2 != 0) {
			System.out.print("The Number is Odd");}
	}
}



