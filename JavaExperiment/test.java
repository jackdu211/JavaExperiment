class DeckOfCards{
	public static void main(String[] args){
		int[] deck = new int[52];
		for (int i =0; i < deck.length; i++ ) {
			deck[i] = i;
		}
		deck = random(deck);
		for (int i =0; i < deck.length; i++ ) {
			System.out.println(deck[i]);
		}
	}

	public static int[] random(int[] arr){
		int length = arr.length;
		int[] newarr = new int[length];
		Random r = new Random();
		int k = 0;

		while(k < length){
			int index = r.nextInt(length - k);	
			newarr[k++] = arr[index];
			arr[index] = arr[length - k];
		}

		return newarr;
	}
}

