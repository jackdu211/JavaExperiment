import java.util.Scanner;


public class ComputeChange{

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		System.out.println("Enter an amount in double ");
		double amount = cin.nextDouble();
		int remainingAmount = (int) (amount * 100);

		int numberOfOneDollers = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		int numberOfOneQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int numberOfOneDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int numberOfOneNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int numberOfPennis = remainingAmount;

		System.out.println("Your amount " + amount + "   consists of");
		System.out.println("    " + numberOfOneDollers + "  dollars");
		System.out.println("    " + numberOfOneQuarters + "   quarters");
		System.out.println("    " + numberOfOneDimes + " dimes"); 
		System.out.println("    " + numberOfOneNickels + "  nickels");
		System.out.println("    " + numberOfPennis + "  pennis");  


	}


}