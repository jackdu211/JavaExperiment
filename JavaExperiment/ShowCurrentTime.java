import java.io.IOException;
import java.io.File;
import java.io.BufferedReader; 
import java.io.InputStreamReader; 


public class ShowCurrentTime{

	static void clean(){

         try {

	      String shpath="/home/jackdu/Code/Java/JavaExperiment/Shell/clean.sh"; 
	      Process ps = Runtime.getRuntime().exec(shpath); 
	      ps.waitFor(); 
	 
	      BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream())); 
	      StringBuffer sb = new StringBuffer(); 
	      String line; 
	      while ((line = br.readLine()) != null) { 
	        sb.append(line).append("\n"); 
	      } 
	      String result = sb.toString(); 
     	  System.out.println(result); 
         }catch (Exception e) {  
            e.printStackTrace();  
            }  

	}


	static void showTime(){
		long totalMilliSeconds = System.currentTimeMillis();
		long totalSeconds = totalMilliSeconds / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		
		int currentSeconds = (int)totalSeconds % 60;
		int currentMinutes = (int)totalMinutes % 60;
		int currentHours = (int)totalHours % 24;

		System.out.println ("Current Time :" + currentHours + ":" + currentMinutes + ":" + currentSeconds + "GMT");
		clean();
	}


	public static void main(String[] args) {
		

		// Process process = Runtime.getRuntime().exec("clear");  

		while(true){
			
			showTime();
			try {
				Thread.sleep(500);
			}
			  catch(Exception e) {  
            e.printStackTrace();  
            }  
			


			clean();
		}



	}
}