pakage chapter3
import java.io.*;


class E607_10  {

    public static void main(String[] args) {

        if(args.length != 2){
            System.out.println("Error input! ");
            System.exit(0);
        }

        File file  = new File(args[0]);
        int num = Integer.parseInt(args[1]);
        cut(file,num);
        
    }

     public static void cut(File file ,int num) {

        long lon = file.length() / num + 1L;
    
        try {
            RandomAccessFile raf1 = new RandomAccessFile(file, "r");
 
            byte[] bytes = new byte[1024];
            int len = -1;
            for (int i = 0; i < num; i++) {
                String name = "Newfile" + (i + 1) + ".mp3";
                File file2 = new File(name);
                RandomAccessFile raf2 = new RandomAccessFile(file2, "rw");
 
                while ((len = raf1.read(bytes)) != -1){
                    raf2.write(bytes, 0, len);
                    if (raf2.length() > lon)
                        break;
                }
                raf2.close();
            }
            raf1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }





    
}
