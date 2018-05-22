class ExcDemo1{
	public static void main(String args[]){
		int nums[] = new int[4];

//so all code that we want to monitor, needs to be enclosed in the "try"
		try{
			System.out.println("before exception.");

			//now we make an out-of-bounds exception
			nums[7] = 10;
			//it doesn't print this line, because as soon as the exception happens
			//it "throws" and we're kicked out of this part of the code
			//and into the "catch" part... 
			System.out.println("you can't see me");
		}
	//so we have to know what exceptions we might get, I guess?
		catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("index out-of-bounds");
		}
		System.out.println("after catch statement");
	}
}