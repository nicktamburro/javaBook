//nested try block
class NestTrys{
	public static void main(String args[]){
		//numer longer than denom
		//here, numer is longer than denom:
		int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};

		try{
			//outer try
			//this try does a loop and divides everything in the two arrays...
			for(int i=0; i<numer.length; i++){
				try{
					//nested try
					System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i]/denom[i]);
				}
				catch (ArithmeticException exc){
					//catch the exception
					//if a divide by zero comes up, it catches it... 
					System.out.println("Can't divide by zero!");
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException exc){
			//catch the exception
			//if the loop ITSELF doesn't work it goes to this catch...
			//but I'm still not sure why?

//here is why... the INNER try catches errors that you can pretty much just brush off and move on from,
			//the OUTER try is for stuff we can't just bounce back from, the program will not work...
			System.out.println("No matching element found.");
			System.out.println("Fatal error = program terminated.");
			System.out.println("But why isn't this error inside the second try, too");
		}
	}
}