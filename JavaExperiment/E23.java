import java.util.Scanner;
import java.io.*;
class E23 {
	 public static void main(String[] args) {   

	 	Scanner input = new Scanner(System.in);
	 	System.out.print("please input the oldFileName: ");
	 	String oldFileName = input.next();
	 	System.out.print("please input the newFileName: ");
	 	String newFileName = input.next();
	 	System.out.println();
        File f=new File(oldFileName);   
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


/*import java.util.Scanner;
import java.io.*;
class E23 {
        File   file=new   File("TEST.txt");   
		String name="12345678";     
        String   filename=file.getAbsolutePath();     
       	// System.out.println(filename);
        // if(filename.indexOf(".")>=0){     
        //       filename   =   filename.substring(0,filename.lastIndexOf("."));     
        // }     
        if(file.renameTo(new File(name+".jpg")))
          	System.out.println("Success !");      
      	else
      		System.out.println("Failure !");    

      }    

}*/