//Exercise2.30
import java.util.Scanner;

public class ClassExercise14{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter five digits: ");
		int fiveDigits = input.nextInt();
		int firstNum = fiveDigits/10000;
		int secNum = (fiveDigits/1000) % 10;
		int thirNum = (fiveDigits/100) % 100 % 10;
		int fourthNum = (fiveDigits/10) % 1000 % 100 % 10;
		int fifthNum = fiveDigits % 10000 % 1000 % 100 % 10;
if(fiveDigits > 9999 && fiveDigits < 99999){System.out.print(firstNum +"   "+ secNum +"   "+thirNum + "   " + fourthNum +"   "+ fifthNum);}
		if (fiveDigits > 99999){System.out.print("The Digits are more than five");}
		if (fiveDigits < 10000) {System.out.print("The Digits are less than five");}
		
			}
}