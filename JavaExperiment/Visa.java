import java.util.Scanner;

public class Visa{

	static boolean is(String str){

		if(!str.substring(0,5).equals("45376")){
			// System.out.println(str.substring(0,4));
			return false;
		}





		return true;
	}


	public static void main(String[] args) {
		String number;
		Scanner cin = new Scanner(System.in);
		number = cin.next();


		if (is(number))
			System.out.println("valid !");
		else
			System.out.println("invalid !");

		char[] num = number.toCharArray();
		System.out.println(num[4]);

		int sum1 = 0, sum2 = 0;

		for (int i = 0; i < num.length; i += 2) {

			int temp = num[i] - '0';
			int temp1 = temp * 2;

			if (temp1 > 10)
				temp1 -= 9;

			sum1 += temp1;
			
		}


	}
}