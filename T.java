class Base{

int a = 0;
public void println(){

	System.out.println("base class");
}

}


class M extends Base {

public M(){
	this("this constructor" );
	System.out.println("NO.1");

}

public M(String S){
System.out.println(S);

}



public void println(){
		super.println();	
		System.out.println("M class");

}



int b = 2;

}


public class T{


	public static void main(String[] args) {
		Base A = new M();
		M B = (M)A	;
		A.println();
		System.out.println();
		A.println();
	}
}