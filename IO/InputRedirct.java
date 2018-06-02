import java.util.Scanner;



public class InputRedirct{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String in ;

		for(int i = 0; i < 5; i ++){
			in = input.next();
			System.out.print(in + " ");

		}

	}

}