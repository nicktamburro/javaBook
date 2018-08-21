class UseCast{
	public static void main(String args[]){
		int i;

		for (i = 0; i < 5; i++){
			//loop until i is 5
			System.out.println(i + " / 3: " + i / 3);
			//first it just rounds the numbers
			System.out.println(i + " / 3 with fractions: " + 
								(double) i / 3);
			//then we say we want i to now be a double, so it can show decimals
			System.out.println();
		}


	}
}