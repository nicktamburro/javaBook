class ExcDemo1{
	public static void main(String args[]){
		int nums[] = new int[4];

		try{
			System.out.println("before exception.");

			//now we make an out-of-bounds exception
			nums[7] = 10;
			System.out.println("you can't see me");
		}
		catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("index out-of-bounds");
		}
		System.out.println("after catch statement");
	}
}