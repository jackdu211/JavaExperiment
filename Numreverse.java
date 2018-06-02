import java.util.Scanner;
public class Numreverse{
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		int re = 0;
		while (true){
			re = re*10 + (num%10);
			num = num/10;
			if (0 == num)
				break;
		}
		System.out.println(re);
	}
}