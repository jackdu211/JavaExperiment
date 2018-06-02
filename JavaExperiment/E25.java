import java.io.*;

class E25 {

	public static void main(String[] args) {

		String content = getStringFromFile("test.java");
		String newcontent = content.replaceAll("\\s{0,}\n\\t{0,}\\{" ,"{");  
		WriteStringToFile("test.java",newcontent);
	}
	

	public static String getStringFromFile(String fileName) {  
        String encoding = "UTF-8";  
        File file = new File(fileName);  
        Long filelength = file.length();  
        byte[] filecontent = new byte[filelength.intValue()];  
        try {  
            FileInputStream in = new FileInputStream(file);  
            in.read(filecontent);  
            in.close();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        try {  
            return new String(filecontent, encoding);  
        } catch (UnsupportedEncodingException e) {  
            System.err.println("The OS does not support " + encoding);  
            e.printStackTrace();  
            return null;  
        }  
    }  


    public static void WriteStringToFile(String filePath, String s) {  
        try {  
            FileOutputStream fos = new FileOutputStream(filePath);  
            fos.write(s.getBytes());  
            fos.close();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}