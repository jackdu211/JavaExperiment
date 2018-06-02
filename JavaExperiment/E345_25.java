import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class E345_25 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please input the string:  ");
		String str = input.next();
		System.out.print("Please input the split:  ");
		String split = input.next();

		String[] list = split(str,split);

		for(String s : list)
			System.out.print(s + " ");


		System.out.println();

	}
	
	public static String[] split(String s, String regex){

		ArrayList<String> strs = new ArrayList<String>();
		int len = regex.length();

		while(s.length() > 0){
			int index = s.indexOf(regex);
			if(index >= 0){
			strs.add(s.substring(0,index));
			strs.add(s.substring(index,index + len));
			s = s.substring(index + len);
			}
			else{
				strs.add(s);
				break;
			}
		}		
		String[] arrays =(String[]) strs.toArray(new String[1]);

		return arrays;
	}


}