//Exercise2.16
import java.util.Scanner;

public class ClassExercise5{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("\n Enter First Interger: ");
		int firstInteger = input.nextInt();
	
		System.out.print("Enter Second Interger: ");
		int secondInteger = input.nextInt();
	
		if(firstInteger > secondInteger){
		System.out.print("First Integer is larger than the Second Integer");}
		if(firstInteger < secondInteger){
		System.out.print("Second Integer is larger than the First Integer");}
		if(firstInteger == secondInteger){
		System.out.print("The numbers are equal");}
	}
}

