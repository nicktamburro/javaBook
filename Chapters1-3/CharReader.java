class CharReader{
	public static void main(String args[])
	throws java.io.IOException{
	//above line, just memorize it!

		//okay this one actually fails, it counts one per TURN, if you type 30 characters
		//in one turn, it just counts 1... think about that
		// okay, this is why they asked to count spaces... maybe I can figure this out though

			//initializing the variables,
			char ch, ignore, answer = '.';
			int total = 0;


			//do this stuff until we get a period
			do{
				System.out.println("Type some characters, when you're done, type a '.'");

			//ch = whatever they type
				ch = (char) System.in.read();
					total++;

				//but we ignore it, so it doesn't... what exactly? clog up the thing? (technical term)
					do{
						ignore = (char) System.in.read();
					}while (ignore != '\n');

				if (ch == answer){
					System.out.println("You typed " + total + " characters.");
				}else{
					System.out.println("type some more!");
				}
			}while (ch != answer);


	}
}



		