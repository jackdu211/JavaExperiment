import java.io.*;
class E24 {
	public static void main(String[] args) {
	
	   addPakage("/home/jackdu/Code/Java/JavaExperiment/File");

	}


 	public static void addPakage(String dir) {
        File dirFile = new File(dir);
        String dirname  = dirFile.getName();
        if ((!dirFile.exists())) {
            System.out.println("文件：" + dir + "不存在！");
            System.exit(0);
        }

        File[] files = dirFile.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
            	try{
	               appendFilePakage(dirname,files[i].getAbsolutePath());
	           }catch(Exception e){
	           	System.out.println("Error!");
	           }
            }
            else if (files[i].isDirectory()) {
                addPakage(files[i].getAbsolutePath());
            }
        }
    }

    private static void appendFilePakage(String dir,String srcPath) throws Exception{  
    	String pakage = "pakage " + dir + "\n";
    	byte[] header = pakage.getBytes();
        RandomAccessFile src = new RandomAccessFile(srcPath, "rw");  
        int srcLength = (int)src.length() ;  
        byte[] buff = new byte[srcLength];  
            src.read(buff , 0, srcLength);  
            src.seek(0);  
            src.write(header);  
            src.seek(header.length);  
            src.write(buff);  
            src.close();  
    }  









}