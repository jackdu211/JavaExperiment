import java.util.Scanner;
public class Test1{

	public static void main(String[] args){
		
		print("Hello World", "java");
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		int[] score = new int[num];
		String[] name = new String[num];
		for (int i = 0; i < num; i++){
			score[i] = cin.nextInt();
			name[i] = cin.next();
		}
		show(score,name);

		sort(score,name);
		show(score,name);
			

	}
	public static void print(String... s){

			for (int i = 0; i < s.length; i++)
				System.out.print(s[i]);
	}
	public static void sort (int[] N, String[] S){
		int index, temp;
		String s = "";
		for (int i = 0; i<N.length; i++){
			for (int j = i; j < N.length; j++){
				if (N[i] < N[j]){
					temp = N[i];
					N[i] = N[j];
					N[j] = temp;
					s = S[i];
					S[i] = S[j];
					S[j] = s;

				}
			}
		}



	}
	public static void show(int[] N, String[] S){
	  for (int i = 0; i<N.length; i++){
	  	System.out.print(N[i]);
	  	System.out.print(S[i]);
	  }
	}
}