import java.util.Scanner;
import javax.swing.JOptionPane;
public class DeciamlToBinary{
	public static void main(String[] args) {
        int n;
        String result = "";
        boolean minus = false;
	
	Scanner cin = new Scanner(System.in);
	
	n = cin.nextInt() ;

 	System.out.println(n);

        //如果该数字为负数，那么进行该负数+1之后的绝对值的二进制码的对应位取反，然后将它保存在result结果中
        if(n < 0){
            minus = true;
            n = Math.abs(n + 1);
        }

        while(true){
            int remainder = (!minus && n % 2 == 0) || (minus && n % 2 == 1) ? 0 : 1;

            //将余数保存在结果中
            result = remainder + result;
            n /= 2;

            if(n == 0){
                break;
            }
        }

        //判断是否为负数，如果是负数，那么前面所有位补1
        if(minus){
            n = result.length();
            for(int i = 1; i <= 32 - n; i++){
                result = 1 + result;
            }
        }

	else
		{
            n = result.length();
            for(int i = 1; i <= 32 - n; i++){
                result = 0 + result;
            }
        }

        System.out.println(result);

    }
}
