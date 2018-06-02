public class Print {



	public static void main(String[] args) {
		int INT = 1000;
		double DOUBLE = 2.13141;
		float FLOAT = 3.1314f;
		char CHAR = 'C';
		String STRING = "STRING";
		boolean BOOL = false;

		System.out.printf("Print int %d\n", INT);
		System.out.printf("Print double %-40.20f\n", DOUBLE);
		System.out.printf("Print float %f\n", FLOAT);
		System.out.printf("Print char %c\n", CHAR);
		System.out.printf("Print String %s\n", STRING);
		System.out.printf("Print bool %b\n", BOOL);
		System.out.printf("Print E %e", DOUBLE);

	}


}