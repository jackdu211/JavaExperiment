import java.util.Scanner;
 public class File{

	public static void main(String[] args) throws Exception	{
		java.io.File file = new java.io.File("source.txt");
		if (file.exists())	
			System.out.println("file already exits");
			java.io.PrintWriter output = new java.io.PrintWriter(file);

		output.close();

		/*

		output.println("Smith:");
		output.println(90);
		output.println("Smith:");
		output.println(90);
		output.println("Smith:");
		output.println(90);

		
		Scanner input = new Scanner(file);

		while (input.hasNext()){
			String name = input.next();
			int num = input.nextInt();
			System.out.println(name);
			
		}

		input.close();
*/

	}


}