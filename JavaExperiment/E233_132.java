class E233_132 {

	public static void main(String[] args) {

		if(args.length != 3){
			System.out.println("please input corrort number!");
			return ;
		}
	
		double num1 = 0, num2 = 0;
		int ponint;

		ponint = args[0].length() - 1;
		for(int i = 0; i < args[0].length(); i++){
			if(args[0].charAt(i) == '.'){
				ponint = i;
				continue;
			}
			num1 += args[0].charAt(i) - '0';
			num1 *= 10;
		}

		for (int i = 0; i <= args[0].length() - ponint - 1;i ++ ) {
			num1 /= 10;
		}
		

		
		ponint = args[2].length() - 1;
		for(int i = 0; i < args[2].length(); i++){
			if(args[2].charAt(i) == '.'){
				ponint = i;
				continue;
			}
			num2 += args[2].charAt(i) - '0';
			num2 *= 10;
		}

		for (int i = 0; i <= args[2].length() - ponint - 1;i ++ ) {
				num2 /= 10;
			}
		


		switch(args[1].charAt(0)){
			case '+': System.out.println(num1 + " " + args[1] + " " + num2 + " = " +  (num1 + num2));break;
			case '-': System.out.println(num1 + " " + args[1] + " " + num2 + " = " +  (num1 - num2));break;
			case '.': System.out.println(num1 + " " + args[1] + " " + num2 + " = " +  (num1 * num2));break;
			case '/': System.out.println(num1 + " " + args[1] + " " + num2 + " = " +  (num1 / num2));break;
			default: System.out.println("no match method");

		}

	}
	


}