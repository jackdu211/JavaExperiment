import java.util.Scanner;
import java.io.*;
class E23 {
	 public static void main(String[] args) {   

	 	Scanner input = new Scanner(System.in);
	 	System.out.print("please input the oldFileName: ");
	 	String oldFileName = input.next();
	 	System.out.println();
	 	System.out.print("please input the newFileName: ");
	 	String newFileName = input.next();
	 	System.out.println();
        File f=new File("oldFileName");   
        String c=f.getParent();   
        File mm=new File(newFileName);   
        if(f.renameTo(mm))   
        {   
        System.out.println("修改成功!");   
        }   
        else   
        {   
        System.out.println("修改失败");   
        }  
  
    }  
}