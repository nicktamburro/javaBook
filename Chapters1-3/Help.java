class Help{
	public static void main(String args[])
	throws java.io.IOException{
		char choice, ignore;

//infinite for loop:
	for(;;){
		//okay yeah, infinite loop!
	do{
		System.out.println("What can I help you with?");
		System.out.println("1. If statments");
		System.out.println("2. Switch statements");
		System.out.println("3. For loops");
		System.out.println("4. While loops");
		System.out.println("5. Dl-while loops");
		System.out.println("6. break");
		System.out.println("7. continue\n");
		System.out.println("Choose one...(q to quit) ");

		choice = (char) System.in.read();

		//this do-while clears the buffer, which I don't understand yet
		//yeah read this one again... 
		do {
			ignore = (char) System.in.read();
		}while (ignore != '\n');
	}while (choice < '1' || choice > '7' && choice != 'q');

	if (choice == 'q'){
		System.out.println("goodbye");
		break;
	}


//the choices HAVE TO BE STRINGS!!
		switch(choice){
			case '1':
				System.out.println("if (condition) (what to execute)");
				break;
			case '2':
				System.out.println("switch(variable) case(number): (action) break; ");
				break;
			case '3':
				System.out.println("for (variable ; condition ; increment");
				break;
			case '4':
				System.out.println("while (condition) (do something)");
				break;
			case '5':
				System.out.println("do {something} while (condition)");
				break;
			case '6':
				System.out.println("break; or break (label);");
				break;
			case '7':
				System.out.println("continue;or continue (label);");
				break;
			//default:
			//	System.out.println("Sorry, that choice in not avaialable.");
		}
		System.out.println();

	}
}
} // end of infinite For loop