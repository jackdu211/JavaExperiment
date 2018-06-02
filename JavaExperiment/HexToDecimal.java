import java.util.*;

public class HexToDecimal {
public static  void main(String[]args){
	Scanner input=new Scanner(System.in);


	System.out.print("please input a hex:    ");
	String hex=input.nextLine();
	System.out.println("hex:"+hex.toUpperCase());
	System.out.println("Decimal:"+hexToDecimal(hex.toUpperCase()));

}

public static int hexToDecimal(String hex){
	int decimalValue=0;
	for(int i=0;i<hex.length();i++){
	char hexChar=hex.charAt(i);
	decimalValue=decimalValue*16+hexCharToDecimal(hexChar);
	}
	return decimalValue;
	}

	public static int hexCharToDecimal(char hexChar){
	if(hexChar>='A'&&hexChar<='F')
	return 10+hexChar-'A';
	else
	return hexChar-'0';
}
}