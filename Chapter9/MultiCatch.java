class MultiCatch{
	public static void main(String args[]){
		//we make two ints, a and b, and assign value
		int a=99, b=0;
		//another int called result
		int result;
		//an array of characters, a b and c
		char chrs[] = {'A', 'B', 'C'};

    //we loop two times
		for(int i=0; i<2; i++){
			try{
				//the first time, divide by zero to get this exception
				if(i == 0)
					result = a/b; // generates Arithmeic exception
				//the second time, get an array index that isn't there... 
				else
					chrs[5] = 'X'; //generates out-of-bounds exception
			//this catch catches BOTH exceptions
			}
			//then we catch EITHER ONE, and dynamically say which is was, with the "e"
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
				System.out.println("Exception caught: " + e);
			}
		}
		System.out.println("After multi-catch.");
		//cool
	}
}