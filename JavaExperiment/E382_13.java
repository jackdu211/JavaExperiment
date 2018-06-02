import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
class E382_13 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner  input = new Scanner(System.in);
		int N;
		System.out.println("plaese input the numbers you want to input!");
		N = input.nextInt();
		for (int i = 0; i < N ;i ++ ) {
			list.add(input.nextInt());
		}

		System.out.println("the list's content before use function removeDuliacte :");

		for(Integer num: list){
			System.out.print(num + " ");
		}
		System.out.println();

		removeDuliacte(list);
		System.out.println("the list's content after use function removeDuliacte :");

		for (Iterator<Integer> lists = list.iterator(); lists.hasNext() ; ) {
			 System.out.print(lists.next() + " ");
		}
		System.out.println();
			
	}
	

	public static void removeDuliacte(ArrayList<Integer> list){

		for (int i = 0; i < list.size(); i ++) 
			for (int j = i + 1; j < list.size(); j ++ ) {
					if( list.get(j).equals(list.get(i)) ){
						// System.out.println(j);
						list.remove(j);		
						j --;
					}

			}


	}
}