import java.util.Scanner;
import java.net.URL;
import java.util.ArrayList;
class E29{

	public static void main(String[] args) {
		readFileFromURL("http://www.jackdu.cn");
		crawler("http://www.jackdu.cn");
	}
	
	public static void readFileFromURL(String urlString){
		try{
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()){
				System.out.println(input.nextLine());
			}
		}
		catch(java.net.MalformedURLException e){
			System.out.println("Invalid URL");

		}
		catch(java.io.IOException e){
			System.out.println("IO Errors !");
		}
	}


	public static void crawler(String strurl){
		ArrayList<String> listOfPending =  new ArrayList<>();
		ArrayList<String> listOfTraversed =  new ArrayList<>();
		listOfPending.add(strurl);
		while(!listOfPending.isEmpty() && listOfTraversed.size() < 50){
			String urlString = listOfPending.remove(0);
			if(!listOfTraversed.contains(urlString)){
				listOfTraversed.add(urlString);
				System.out.println("Crawl: " + urlString);
				for (String s: getSubURLs(urlString)) {
					if(!listOfTraversed.contains(s))
						listOfPending.add(s);
				}
			}
		}
	}

	public static ArrayList<String> getSubURLs(String strurl){
		ArrayList<String> list = new ArrayList<>();
		try{
			int current = 0;
			URL url = new URL(strurl);
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()){
				String line = input.nextLine();
				current = line.indexOf("http:",current);
				while(current > 0){
					int endIndex = line.indexOf("\"",current);
					if(endIndex > 0){
						list.add(line.substring(current,endIndex));
						current = line.indexOf("http:",endIndex);
					}
					else
						current = -1;
				}

			}
		}
		catch(Exception e){
				System.out.println("Crawl Error !");
		}

		return list;

	}




}