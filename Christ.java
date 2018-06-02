import java.util.Scanner;
 
public class Christ {
 
    /**
     * @param args
     */
    public static void main(java.lang.String[] args) {
        Christ temp = new Christ();
        System.out.println("请输入您需要的圣诞树的大小<数字>");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        temp.ChristmasTree(2*a);
    }
 
 
    void ChristmasTree(int n) {
        int i, j, k, m;
        for (i = 1; i <= n / 2; i++) {
            for (j = 1; j < n / 2 + i; j++) {
                if (j <= n / 2 - i)
                    System.out.print(" ");
                else {
                    if (j % 2 == 0)
                        System.out.print("$");
                    else
                        System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        for (k = n / 2 + 1; k <= n - n / 4; k++) {
            for (m = 1; m <= n + 1; m++) {
                if (m != n / 2)
                    System.out.print(" ");
                else
                    System.out.print("||");
            }
            System.out.print("\n");
        }
 
    }
 
}