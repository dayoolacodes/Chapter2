//Exercise2.17
import java.util.Scanner;

public class ClassExercise6{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("\n Enter New Number1: ");
		int newNumber1 = input.nextInt();

		System.out.print("Enter New Number2: ");
		int newNumber2 = input.nextInt();

		System.out.print("Enter New Number3: ");
		int newNumber3 = input.nextInt();
	
		int newSum = newNumber1 + newNumber2 + newNumber3;
		int newProduct = newNumber1 * newNumber2 * newNumber3;
		int newAverage = newSum / 3;
	
		System.out.printf("The Sum is %d%n", newSum);
		System.out.printf("The Average is %d%n", newAverage);
		System.out.printf("The Product is %d%n", newProduct);
	
		if(newNumber1 > newNumber2 && newNumber1 > newNumber3){
			System.out.print(" New Number1 is the largest");}
		if(newNumber1 < newNumber2 && newNumber1 < newNumber3){
			System.out.print(" New Number1 is the Smallest");}

		if(newNumber2 > newNumber1 && newNumber2 > newNumber3){
			System.out.print(" New Number2 is the largest");}
		if(newNumber2 < newNumber1 && newNumber2 < newNumber3){
			System.out.print(" New Number2 is the Smallest");}

		if(newNumber3 > newNumber2 && newNumber3 > newNumber1){
			System.out.print(" New Number3 is the largest");}
		if(newNumber3 < newNumber2 && newNumber3 < newNumber1){
			System.out.println(" New Number3 is the smallest");}

		if(newNumber1 == newNumber2){
			System.out.print (" New Number1 is equal to new Number2");}
	
		if(newNumber1 == newNumber3){
			System.out.print (" New Number1 is equal to new Number3");}
	
		if(newNumber2 == newNumber3){
			System.out.print (" New Number2 is equal to new Number3");}

	}
}