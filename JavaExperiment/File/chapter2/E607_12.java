pakage chapter2
import java.io.*;


public class E607_12 {

    public static void main(java.lang.String[] args) {

        if(args.length < 2){
            System.out.println("Error input! ");
            System.exit(0);
        }

        merge(args);
        
    }

	public static void merge(String[] str){
        File file = new File(str[str.length - 1]);
        try { 
            RandomAccessFile target = new RandomAccessFile(file, "rw");
            for (int i = 0; i < str.length - 1; i++) {
                File file2 = new File(str[i]);y
                RandomAccessFile src = new RandomAccessFile(file2, "r");
                byte[] bytes = new byte[1024];
                int len = -1;
                while ((len = src.read(bytes)) != -1) {
                    target.write(bytes, 0, len);
                }
                src.close();
            }
            target.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	 }



 }
