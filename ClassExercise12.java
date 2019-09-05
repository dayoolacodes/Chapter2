//Exercise2.28
import java.util.Scanner;

public class ClassExercise12{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter Radius: ");
		int radius = input.nextInt();
		
		System.out.printf("The Diameter is %d%n", (2 * radius));
		System.out.printf("The Circumference is %f%n", 2*Math.PI*radius);
		System.out.printf("The Area is %f%n", Math.PI * radius * radius);
	}
}