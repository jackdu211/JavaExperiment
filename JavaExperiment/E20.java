import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

class E20 {
	
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		System.out.println("list add char 'c'");
		list.add('c');
		System.out.println("list add String \"ABC\"");
		list.add("ABC");
		System.out.println("list add int 123");
		list.add(123);	

		System.out.print("list get char ");
		System.out.println(list.get(0));
		System.out.print("list get String ");
		System.out.println(list.get(1));
		System.out.print("list get int ");
		System.out.println(list.get(2));

	}
}