import java.util.Scanner;

public class Calendar {
 public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("选择年份(注必须大于1990年):");
        int year=input.nextInt();
        System.out.println("选择该年月份：");
        int month=input.nextInt();
        boolean Renyear;
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"是闰年");
            Renyear=true;
        }
        else{
            System.out.println(year+"是平年");
            Renyear=false;
        }
        int day=0;
        switch (month){
        case 1:day=31;break;
        case 3:day=31;break;
        case 4:day=30;break;
        case 5:day=31;break;
        case 6:day=30;break;
        case 7:day=31;break;
        case 8:day=31;break;
        case 9:day=30;break;
        case 10:day=31;break;
        case 11:day=30;break;
        case 12:day=31;break;
        default:if(Renyear){
            day=29;
        }
        else{
            day=28;
        }
        break;
        }

        System.out.print(year+"年"+month+"月"+"有"+day+"天"+"\t");
        System.out.println(month+"月份的万年历如下：");
        int sum=0;
        for(int i=1990;i<year;i++){
            if(i%4==0&&i%100!=0||i%400==0){
                sum=sum+366;
            }
            else{
                sum=sum+365;
            }
        }


        for(int i=1;i<month;i++){
            if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                sum=sum+31;
            }
            else if(i==4||i==6||i==9||i==11){
                sum=sum+30;
            }
            else {
                if(Renyear)
                sum=sum+29;
                else
                sum=sum+28;
            }   
        }


        int blank=sum%7+1;
        System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
         
        int temp=1;
        for(int i=0;i<blank;i++){
            System.out.print("\t");
            temp++;
        }
        if(temp>7){
            System.out.println("");
            temp=1;
        }
        for(int i=1;i<=day;i++){
            if(temp%7==0){
                System.out.print(i+"\n");
                temp=1;
            }
            else{
                System.out.print(i+"\t");
                temp++;
            }
        }

         System.out.println("");
         
    }
}
