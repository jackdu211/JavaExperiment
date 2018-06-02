import java.lang.String;


public class MyString{

	

	   public static void main(String[] args) {
		
		Book s = new Book();
		// new Book();	
		System.gc();

	}



}



class Book{


	Book(){
		System.out.print("hu ");
	}

	 protected	void finalize(){
			System.out.print("hu ");
		}
}