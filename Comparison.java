import java.util.Scanner;

public class Comparison{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
		System.out.print("Enter your First Number: ");
		int firstNumber =  input.nextInt();
	
		System.out.print("Enter your Second Number: ");
		int secondNumber =  input.nextInt();

		if(firstNumber == secondNumber){
		System.out.print("The numbers are equal");}
		
		if(firstNumber != secondNumber)
		System.out.print("The numbers are not equal");
		
		if(firstNumber > secondNumber) 
		System.out.print(" The First Number is greater than the Second Number");
		
		if(firstNumber < secondNumber) {
		System.out.print(" The First Number is less than the Second Number");
		}



	}


}