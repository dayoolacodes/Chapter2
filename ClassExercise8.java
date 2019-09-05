//Exercise2.24
import java.util.Scanner;

public class ClassExercise8{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter First Digit: ");
			int firstDigit = input.nextInt();

		System.out.print("Enter Second Digit: ");
			int secondDigit = input.nextInt();

		System.out.print("Enter Third Digit: ");
			int thirdDigit = input.nextInt();

		System.out.print("Enter Fourth Digit: ");
			int fourthDigit = input.nextInt();
	
		System.out.print("Enter Fifth Digit: ");
			int fifthDigit = input.nextInt();

		if(firstDigit > secondDigit && firstDigit > thirdDigit && firstDigit > fourthDigit && firstDigit > fifthDigit){
			System.out.print("\nThe First Digit is the Largest Number");}
		if(firstDigit < secondDigit && firstDigit < thirdDigit && firstDigit < fourthDigit && firstDigit < fifthDigit){
			System.out.print("\nThe First Digit is the Smallest Number");}
	
		if(secondDigit > firstDigit && secondDigit > thirdDigit && secondDigit > fourthDigit && secondDigit > fifthDigit){
			System.out.print("\n The Second Digit is the Largest Number");}
		if(secondDigit < firstDigit && secondDigit < thirdDigit && secondDigit < fourthDigit && secondDigit < fifthDigit){
			System.out.print("\n The Second Digit is the Smallest Number");}
	
		if(thirdDigit > secondDigit && thirdDigit > firstDigit && thirdDigit > fourthDigit && thirdDigit > fifthDigit){
			System.out.print("\nThe Third Digit is the Largest Number");}
		if(thirdDigit < secondDigit && thirdDigit < firstDigit && thirdDigit < fourthDigit && thirdDigit < fifthDigit){
			System.out.print("\nThe Third Digit is the Smallest Number");}

		if(fourthDigit > secondDigit && fourthDigit > thirdDigit && fourthDigit > firstDigit && fourthDigit > fifthDigit){
			System.out.print("\nThe Fourth Digit is the Largest Number");}
		if(fourthDigit < secondDigit && fourthDigit < thirdDigit && fourthDigit < firstDigit && fourthDigit < fifthDigit){
			System.out.print("\nThe Fourth Digit is the Smallest Number");}

		if(fifthDigit > secondDigit && fifthDigit > thirdDigit && fifthDigit > fourthDigit && fifthDigit > firstDigit){
			System.out.print("\nThe Fifth Digit is the Largest Number");}
		if(fifthDigit < secondDigit && fifthDigit < thirdDigit && fifthDigit < fifthDigit && fifthDigit < firstDigit){
			System.out.print("\nThe Fifth Digit is the Smallest Number");}

		if(firstDigit == secondDigit && firstDigit == thirdDigit && firstDigit == fourthDigit && firstDigit == fifthDigit){
			System.out.print("\nThe numbers are equal");}

		if(firstDigit == secondDigit){
			System.out.print("\nThe First and Second Digits are equal");}
		if(firstDigit == thirdDigit){
			System.out.print("\nThe First and Third Digits are equal");}
		if(firstDigit == fourthDigit){
			System.out.print("\nThe First and Fourth Digits are equal");}
		if(firstDigit == fifthDigit){
			System.out.print("\nThe First and Fifth Digits are equal");}
	
		if(secondDigit == thirdDigit){
			System.out.print("\nThe Second and Third Digits are equal");}
		if(secondDigit == fourthDigit){
			System.out.print("\nThe Second and Fourth Digits are equal");}
		if(secondDigit == fifthDigit){
			System.out.print("\nThe Second and Fifth Digits are equal");}
	
		if(thirdDigit == fourthDigit){
			System.out.print("\nThe Third and Fourth Digits are equal");}
		if(thirdDigit == fifthDigit){
			System.out.print("\nThe Third and Fifth Digits are equal");}	

		if(fourthDigit == fifthDigit){
			System.out.println("\nThe fourth and fifth Digits are equal");}
	}

}

