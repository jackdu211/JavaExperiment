import java.util.Calendar;
import java.util.Scanner;

public class Calender {

        public static void main(String[] args) {
          
            Scanner sc=new Scanner(System.in);
            System.out.print("请输入年份:  ");
            int year = sc.nextInt();
            System.out.print("请输入月份:  ");
            int month = sc.nextInt();
          
            printCalender(year,month - 1);
            printCalender(year,month);
            printCalender(year,month + 1);


            }

        


        public static void printCalender(int year, int m){

            Calendar calendar = Calendar.getInstance();
            int count = 1;
            int days;
            int month=m - 1;
            if (month < 0) {
                month = 11;
                year -= 1;
                
            }

            if (month > 11) {
                month = 0;
                year += 1;
                
            }
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DATE, 0);
            if (((year%4==0&&year%100!=0)||(year%400==0))&&m==2) {
                days=29;
            }else{
                days = chooseMonth(month + 1);}
            System.out.println("\n"+year + "年" + (month + 1) + "月的日历：\n");
            System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
            while (count <=days) {
                calendar.add(Calendar.DAY_OF_MONTH, 1);
                int day = calendar.getTime().getDay();  
                if (count ==1) {
                    for (int i = 0; i < day; i++) {
                        System.out.print("\t");
                    }
                }
                if (day == 0) {
                    System.out.println();    
                }
                System.out.print(calendar.getTime().getDate() + "\t");  
                count++;

            }

            System.out.println(""); 

         }



        public static int chooseMonth(int m) {
            int days = 0;
            switch (m) {
                case 2:
                    days = 28;
                    break;

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                default:
                    days = 0;
            }
            return days;
        }
}
