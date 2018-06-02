public class Comper {

	public static void main(String[] args) {
		
		double sum1 = 0;
		double sum2 = 0;

		for (int i = 1; i <= 50000 ; i ++) {

			sum1 += 1.0 / i;
		}

		for (int i = 50000; i >= 1 ; i --) {

			sum2 += 1.0 / i;
		}


		System.out.printf("%-40.20f",sum1);
		System.out.println("");
		System.out.printf("%-40.20f",sum2);

		double s = 1.0 / 5;



		System.out.println("");





	}


}