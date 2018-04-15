class KbIn{
	public static void main(String args[]) 
		throws java.io.IOException{
			//LOOK how curly brace starts here, not after the main() call!

			char ch;

			System.out.print("Press a key followed by ENTER: ");

			ch = (char) System.in.read(); //gets a character, ONLY ONE!

			System.out.println("You chose wisely: " + ch);

		}

	}
