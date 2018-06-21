
import java.util.Calendar;
import java.util.Scanner;
public class Calender {
    static public void main(String args[]){
        Calendar c = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        String[][] calendar = new String[60][21];
        int flag = 0;
        int month = 0;
        System.out.print("请输入年份：");
        int year=sc.nextInt();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, Calendar.JANUARY);
        c.set(Calendar.DAY_OF_MONTH, 1);
        while(c.get(Calendar.YEAR)==year){
            int wday=c.get(Calendar.DAY_OF_WEEK);
            int mday=c.get(Calendar.DAY_OF_MONTH);
            int M = c.get(Calendar.MONTH) % 3;
            if(mday==1){
                flag =  c.get(Calendar.MONTH) / 3 * 5 ;
                for(int i=0;i<wday-1;i++) calendar[flag][M * 7 + i] = " \t";
            }

            calendar[flag][M * 7 + wday - 1] = mday+"\t";
            if(wday==7) flag++;
            c.add(Calendar.DAY_OF_YEAR, 1);
        }


        for (int i = 0;i < 20 ;i ++ ) {
            if(i % 5 == 0){
                System.out.println("\n\n\t\t " + (i / 5 * 3 + 1) + "月" + "\t\t\t\t\t\t\t\t  "+ (i / 5  * 3 + 2) + "月" + "\t\t\t\t\t\t\t  "+ (i / 5 * 3+ 3) + "月" + "\t\t\t\t");
                System.out.println("\n日\t一\t二\t三\t四\t五\t六\t\t日\t一\t二\t三\t四\t五\t六\t\t日\t一\t二\t三\t四\t五\t六\t");
            }
            for (int j = 0;j < 21 ;j++ ) {
                if(j % 7 == 0 && j != 0)
                    System.out.print("\t");
                if(calendar[i][j] != null)
                    System.out.print(calendar[i][j]);
                else
                    System.out.print(" \t");
            }
            System.out.println();
        }

    }
} 