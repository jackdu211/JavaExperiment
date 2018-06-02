


import java.io.*;
public class OutputStream{
	public static void main(String[] args){
		FileInputStream in=new FileInputStream("/home/jackdu/Code/test.txt");
		int b;//定义一个int类型的变量，记住每次读取的一个字节。
		while((b=in.read())!=-1)
		{
			System.out.println(b);//逐个打印出读取的每一个字节
		}
		in.close();
	}
}