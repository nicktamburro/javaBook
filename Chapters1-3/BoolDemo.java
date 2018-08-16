class BoolDemo{
	public static void main(String args[]){
		boolean b;

		//assign false to b
		b = false;
		System.out.println("b is " + b);

		//now it's true
		b = true;
		System.out.println("b is now " + b);

		//if b means "if b is true"
		if (b) System.out.println("This is executed.");

		//now you won't see anything, since b is false
		b = false;
		if (b) System.out.println("You can't see me.");

		//and hey we can do math too
		System.out.println("10>9 is " + (10>9));
	}
}