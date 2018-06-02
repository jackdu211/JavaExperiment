/*public class c357 {


	public static void main(java.lang.String[] args) {

		long MAX =  59084709587505l;
		int count = 0;

		for ( long i = 0; Math.pow(3,i) < MAX; ++i)
			for ( long j = 0; Math.pow(5,j) < MAX; ++j)
				for ( long k = 0; Math.pow(7,k) < MAX; ++k)
					if (Math.pow(3,i) * Math.pow(5,j) * Math.pow (7,k) < MAX )
						count ++;

		System.out.println(count);
		
	}


}*/






import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
public class c357 {


	public static void main(java.lang.String[] args) {


		BigInteger MAX = new BigInteger("59084709587505");
		BigInteger a = new BigInteger("3");
		BigInteger b = new BigInteger("5");
		BigInteger c = new BigInteger("7");

		ArrayList<BigInteger> list = new ArrayList<>();

		int count = 0;
		for ( int i = 0; a.pow(i).compareTo(MAX) == -1; ++i)
			for ( int j = 0; b.pow(j).compareTo(MAX) == -1; ++j)
				for ( int k = 0;c.pow(k).compareTo(MAX) == -1; ++k)
					if (a.pow(i).multiply(b.pow(j)).multiply(c.pow(k)).compareTo(MAX) == - 1){
						list.add(a.pow(i).multiply(b.pow(j)).multiply(c.pow(k)));
						count ++;		
					}


		Collections.sort(list);

		System.out.print("the number 59084709587505 is ");
		System.out.print(count);
		System.out.println("th lucky number ");

		System.out.print("Top 50 lucky numbers");
		for(int i = 0; i < 50; i++){
			System.out.print(" "+list.get(i));
		}	
	





	}


}