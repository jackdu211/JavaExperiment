import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIoStream {

       public static void main(String[] args) throws IOException { 


       try{
            m1();
        }catch(Exception e){
            e.printStackTrace();
        }    
        }

   static void m1() throws Exception{
        try{
            m2();
        }catch(Exception e){
            throw new Exception("A");
        }    

    }

    static void m2() throws Exception{
    
            throw new Exception("B");
        
    }
}