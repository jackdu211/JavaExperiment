import java.util.Random;

public class Test{

	public static void main(java.lang.String[] args) {

		Random r = new Random();
		for (int i = 0; i < 20; i++ ) {
			System.out.println(r.nextInt(2));
		}

	}
}



