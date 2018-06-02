import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
class E22{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner  input = new Scanner(System.in);
		int N;
		System.out.println("plaese input the numbers you want to input!");
		N = input.nextInt();
		for (int i = 0; i < N ;i ++ ) {
			list.add(i);
		}

		System.out.println("the list's content before use function Collection.shuffle():");

		for(Integer num: list){
			System.out.print(num + " ");
		}
		System.out.println();

		Collections.shuffle(list);
		System.out.println("the list's content after use function Collection.shuffle():");

		for (Iterator<Integer> lists = list.iterator(); lists.hasNext() ; ) {
			 System.out.print(lists.next() + " ");
		}
		System.out.println();
	}
	
}