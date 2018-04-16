class CaseChanger{
	public static void main(String args[])
	throws java.io.IOException{
		char input;
		int count = 0;

//works, but it prints out "enter a key" 3 times each time??
		do{
			System.out.println("enter a key");
			input = (char) System.in.read();
			if (input > 64 && input < 91){
				input += 32;
				System.out.println("now it's " + input);
				count++;
				
			}else if (input > 96 && input < 123){
				input -= 32;
				System.out.println("now it's " + input);
				count++;
				
			}

		}while (input != '.');
		System.out.println("letters changed: " + count);
	}
}

