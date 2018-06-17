class NonIntResultException extends Exception{
	//here we create our own custom exception, which extends the (i assume) built-in "Exception"
	//superclass

	//two ints, numerator and denominator
	int n;
	int d;

//this exception takes two ints, 
	NonIntResultException(int i, int j){
		n = i;
		d = j;
	}

	//and it returns this, if it gets caught
	public String toString(){
		return "Result of " + n + " / " + d + " is non-integer.";
	}
}

class CustomExceptDemo{
	public static void main(String args[]){

		//odd values in numer
		int numer[] = {4, 8, 15, 32, 64, 127, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};

//loop to make some mistakes
		for (int i=0; i<numer.length; i++){
			try{
				if ((numer[i]%2) != 0)
					throw new NonIntResultException(numer[i], denom[i]);

				System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i]/denom[i]);
			}
			catch(ArithmeticException exc){
				System.out.println("can't divide by zero!");

			}
			catch (ArrayIndexOutOfBoundsException exc){
				System.out.println("no matching element found!");
			}
			catch(NonIntResultException exc){
				System.out.println(exc);
				System.out.println("but how does this exception get defined or triggered?")
			}
		}
	}
}