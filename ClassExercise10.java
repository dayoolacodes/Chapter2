//Exercise2.26
import java.util.Scanner;

public class ClassExercise10{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("\n Enter Dividend: ");
		int checkMultiple = input.nextInt();

		System.out.print("Enter Divisor:  ");
		int checkMultiple1 = input.nextInt();

		if (checkMultiple % checkMultiple1 == 0){
			System.out.printf("Divisor is a multiple of %d%n ", checkMultiple);}
	
		if (checkMultiple % checkMultiple1 != 0){
			System.out.printf("Divisor not a multiple of %d%n ", checkMultiple);}
	}
}