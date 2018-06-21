import java.util.Scanner;
public class calendar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int years = 0;
		 boolean isRun = false;
		 
		 Scanner input = new Scanner(System.in);
		 System.out.print("输入年份");
		 years = input.nextInt();
		 System.out.println("\n*********"+years+"年日历表***********");
		 
		 if((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)){
			 isRun = true;
			 }
		 else {
			 isRun=false;
		 }
		 
		 int totalDays = 0; //ÀÛŒÆÌìÊý
		 //ŒÆËãŸàÀë1900Äê1ÔÂ1ÈÕµÄÌìµ
		 for(int i = 1900; i < years; i++){
			 if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
				 totalDays = totalDays + 366;
				 }
			 else{
				 totalDays = totalDays + 365;
				 }
			 }
		  
		 int[] yue1= {31,29,31,30,31,30,31,31,30,31,30,31};
		 int[] days1= {0,31,60,91,121,152,182,213,244,274,305,335};
		 int[] yue2= {31,28,31,30,31,30,31,31,30,31,30,31};
		 int[] days2= {0,31,59,90,120,151,181,212,243,273,304,334};
		 
		 
		//ŒÆËãÃ¿žöÔÂµÄµÚÒ»ÌìÊÇÐÇÆÚŒž
				 
		int[] list4=new int[12];
		int[] list2=new int[12];
		 if(isRun==true) 
			 for(int i=0;i<list2.length;i++) {
				 list2[i]=days1[i];
				 list4[i]=yue1[i];			 
			 }
		 else if(isRun==false)
			 for(int i=0;i<list2.length;i++) {
				 list2[i]=days2[i];
				list4[i]=yue2[i];				 
			 }
		 for(int i=0;i<list2.length;i++)
			 System.out.print(list2[i]+"\t");
		 System.out.print("\n");
		 for(int i=0;i<list4.length;i++)
			 System.out.print(list4[i]+"\t");
		 
		int[] list=new int[12];
		 for(int i=0;i<list.length;i++) {
			 list[i]=totalDays+list2[i];
		 }
		 System.out.print("\n");
		 for(int i=0;i<list.length;i++)
			 System.out.print(list[i]+"\t");
		 
		 int firstDayOfMonth=0;
		 int[] list3=new int[12];
		 for(int x=0;x<12;x++) {
		 int temp2 = 1 + list[x] % 7 ;
		 if(temp2 == 7){
		 firstDayOfMonth = 0; //ÖÜÈÕ
		 }
		 else{
		 firstDayOfMonth = temp2;
		 }
		 list3[x]=firstDayOfMonth;
		 }
		 System.out.print("\n");
		 for(int k=0;k<list3.length;k++)
			 System.out.print(list3[k]+"\t");

	 
		 // Êä³öÈÕÀú
		 System.out.print("\n");
		 for(int y=1;y<=3;y++) {
			 System.out.print(y+"ÔÂ\t\t\t\t\t\t\t\t");
			 }
		 System.out.print("\n");
		 for(int y=1;y<=3;y++) {
		 System.out.print("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t\t");
		 }
		 System.out.print("\n");
		 for(int k=0;k<3;k++){
		 for(int s = 0; s < list3[k]; s++)
			 System.out.print("\t");
		 for(int m = 1; m <= 7-list3[k]&&m<=list4[k]; m++)
			 System.out.print( m + "\t");
		 System.out.print("\t");
		 }
		 System.out.print("\n");
		
		
		 for(int k=0;k<3;k++) {
		 for(int m =8-list3[k]; m <= 14-list3[k]&&m<=list4[k]; m++)
			 System.out.print( m + "\t");
		 System.out.print("\t");
		 }
		 System.out.print("\n");
		 for(int k=0;k<3;k++) {
			for(int m=15-list3[k];m<=21-list3[k]&&m<=list4[k];m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");			 
		 }
		 System.out.print("\n");
		 for(int k=0;k<3;k++) {
			 for(int m=22-list3[k];m<=28-list3[k]&&m<=list4[k];m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");
			 }
		 System.out.print("\n");
		 for(int k=0;k<3;k++) {	
			 for(int m=29-list3[k];m<=35-list3[k]&&m<=list4[k];m++)
				 System.out.print( m + "\t");
			 for(int m = list4[k]+1; m <= 35-list3[k]; m++)
				 System.out.print( "\t");
			 System.out.print("\t"); 
			 }
		 			
		 System.out.print("\n");
		 for(int y=4;y<=6;y++) {
			 System.out.print(y+"ÔÂ\t\t\t\t\t\t\t\t");
			 }		
		 System.out.print("\n");
		 for(int y=1;y<=3;y++) {
			  System.out.print("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t\t");
			 }
			 System.out.print("\n");
			 for(int q=1,k=3;q<=3&&k<6;q++,k++) {
			 for(int s = 0; s < list3[k]; s++)
				 System.out.print("\t");
			 for(int m = 1; m <= 7-list3[k]&&m<=list4[k]; m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");
			 }
		 System.out.print("\n");
		 for(int k=3;k<6;k++) {
			 for(int m =8-list3[k]; m <= 14-list3[k]&&m<=list4[k]; m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");
			 }
		 System.out.print("\n");
		 for(int k=3;k<6;k++) {
			 for(int m=15-list3[k];m<=21-list3[k]&&m<=list4[k];m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");	 
			 }
		 System.out.print("\n");
		 for(int k=3;k<6;k++) {
			 for(int m=22-list3[k];m<=28-list3[k]&&m<=list4[k];m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");
			 }
		 System.out.print("\n");
		 for(int k=3;k<6;k++) {	
			 for(int m=29-list3[k];m<=35-list3[k]&&m<=list4[k];m++)
				 System.out.print( m + "\t");
			 for(int m = list4[k]+1; m <= 35-list3[k]; m++)
				 System.out.print( "\t");
			 System.out.print("\t"); 
			 }
		
		 		 
		 System.out.print("\n");
		 for(int y=7;y<=9;y++) {
			 System.out.print(y+"ÔÂ\t\t\t\t\t\t\t\t");
			 }		
		 System.out.print("\n");
		 for(int y=1;y<=3;y++) {
			 System.out.print("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t\t");
			 }
		 System.out.print("\n");
		 for(int q=1,k=6;q<=3&&k<9;q++,k++) {
			 for(int s = 0; s < list3[k]; s++)
				 System.out.print("\t");
			 for(int m = 1; m <= 7-list3[k]&&m<=list4[k]; m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");
			 }
		 System.out.print("\n");
		 for(int k=6;k<9;k++) {
			 for(int m =8-list3[k]; m <= 14-list3[k]&&m<=list4[k]; m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");
			 }
		 System.out.print("\n");
		 for(int k=6;k<9;k++) {
			 for(int m=15-list3[k];m<=21-list3[k]&&m<=list4[k];m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");	 
			 }
		 System.out.print("\n");
		 for(int k=6;k<9;k++) {
			 for(int m=22-list3[k];m<=28-list3[k]&&m<=list4[k];m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");
			 }
		 System.out.print("\n");
		 for(int k=6;k<9;k++) {
			 for(int m=29-list3[k];m<=35-list3[k]&&m<=list4[k];m++)
				 System.out.print( m + "\t");
			 for(int m = list4[k]+1; m <= 35-list3[k]; m++)
				 System.out.print( "\t");
			 System.out.print("\t");
			 }
		 System.out.print("\n");
		 
		 for(int y=10;y<=12;y++) {
			 System.out.print(y+"ÔÂ\t\t\t\t\t\t\t\t");
			 }		
		 System.out.print("\n");
		 for(int y=1;y<=3;y++) {
 			System.out.print("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t\t");			 }
		 System.out.print("\n");
		 for(int q=1,k=9;q<=3&&k<12;q++,k++) {
			 for(int s = 0; s < list3[k]; s++)
				 System.out.print("\t");
			 for(int m = 1; m <= 7-list3[k]&&m<=list4[k]; m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");
			 }
		 System.out.print("\n");
		 for(int k=9;k<12;k++) {
			 for(int m =8-list3[k]; m <= 14-list3[k]&&m<=list4[k]; m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");
			 }
		 System.out.print("\n");
		 for(int k=9;k<12;k++) {
			 for(int m=15-list3[k];m<=21-list3[k]&&m<=list4[k];m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");	 
			 }
		 System.out.print("\n");
		 for(int k=9;k<12;k++) {
			 for(int m=22-list3[k];m<=28-list3[k]&&m<=list4[k];m++)
				 System.out.print( m + "\t");
			 System.out.print("\t");
			 }
		 System.out.print("\n");
		 for(int k=9;k<12;k++) {
			 for(int m=29-list3[k];m<=35-list3[k]&&m<=list4[k];m++)
				 System.out.print( m + "\t");
			 for(int m = list4[k]+1; m <= 35-list3[k]; m++)
				 System.out.print( "\t");
			 System.out.print("\t");
			 }
		 System.out.print("\n");	
	}
}