class GuessingGame{
	public static void main(String args[])
	throws java.io.IOException{

		char ch, ignore, answer = 'k';


		do{
		System.out.println("What letter am I thinking of?");

		ch = (char) System.in.read();

			do{
				ignore = (char) System.in.read();
			}while (ignore != '\n');



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
	}while (answer != ch);
}

}