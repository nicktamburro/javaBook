class GuessingGame{
	public static void main(String args[])
	throws java.io.IOException{
		char ch, answer = 'k';

		System.out.println("What letter am I thinking of?");

		ch = (char) System.in.read();

		if (ch == answer){
			System.out.println("You guessed it!");
		}else{
			System.out.print("Sorry, too");
			if (ch < answer){
				System.out.println(" low!");
			}else{
				System.out.println(" high!");
			}
		}
	}
}