import java.util.Scanner;
import javax.swing.JFrame;
public class Init{
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

}