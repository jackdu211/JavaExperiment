import java.util.Random;



class E205_632  {

	public static void main(String[] args) {
		int ans= 0;

		for (int i = 0;i < 10000 ;i++ ) {
			if(play(0) == 1)
				ans++;
		}
		
		System.out.println(ans);			
	
	}
	
	private static int play(int num){

		Random r = new Random();
		int A = r.nextInt(6) + 1;
		int B = r.nextInt(6) + 1;
		int sum = A + B;

	// System.out.println(A + " " + B + " " +sum + " " + num);
		if(num == 0){
			if(sum == 2 || sum == 3 || sum == 12){
				
				return 0;
			}
			if(sum == 7 || sum == 11){
				
				return 1;
			}

			
			return play(sum);

		}
		else{
			if(sum == num){
				return 1;
			}
			if (sum == 7) {
					
				return 0;
			}
			return play(sum);
		}
	}

}