import java.util.Scanner;

class E203_631{
	public static void main(String[] args) {

		long number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a credit card number as a long integer:");
		number = input.nextLong();
		if(isValid(number))
			System.out.println(number + " is valid");
		else
			System.out.println(number + " is invalid");
		
	}

	public static boolean isValid(long number){
		if(getSize(number) < 13 || getSize(number) > 16)
			return false;

		// System.out.println( getSize(number));

		// System.out.println(sumOfDoublePlace(number));


		if((sumOfEvenPlace(number) + sumOfDoublePlace(number)) % 10 != 0)
			return false;
		if(!prefixIsValid(number))
			return false;
		return true;

	}

	public static int sumOfDoublePlace(long number){
		int sum = 0;
		int temp = 0;
		number /= 10;
		while(number > 0){
			temp =(int) (number % 10);
			if(temp * 2 >= 10)
				temp = temp * 2 - 9;
			else 
				temp *= 2;

			sum += temp;
			number /= 100;
		}

		return  sum;
	}

	// public static int getDigit(int number){

	// }

	public static int sumOfEvenPlace(long number){
		int sum = 0;
		while(number > 0){
			sum += number % 10;
			number /= 100;
		}
		return sum;
	}

	// public static boolean prefixMatched(long number, int d){

	// }

	public static int getSize(long d){
		int size = 0;
		while(d > 0){
			size ++;
			d /= 10;
		}
		return size;

	}

	public static boolean prefixIsValid(long number){
		int size = getSize(number);

		while(size > 2){
			number /= 10;
			size --;

		}
		if(number == 37)
			return true;
		number /= 10;
		if(number == 4 || number == 5 || number ==6)
			return true;
		return false;

	}

}