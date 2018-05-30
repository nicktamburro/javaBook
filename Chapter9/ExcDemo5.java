//subclasses must PRECEDE superclasses in catch statements

class ExcDemo5{
	public static void main(String args[]){
		//here, numer is longer than denom:
		int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};

		for(int i=0; i<numer.length; i++){
			try{
				System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
			}
			catch (ArrayIndexOutOfBoundsException exc){
				//catch the exception
				System.out.println("No matching elements found.");
			}
			catch (Throwable exc) {
				//catch superclass exceptions
				//this catch catches all exceptions except for OutOfbounds
				System.out.println("Some exception occurred.");

				//so this is like, if you want it to return special things for just certain exceptions,
				//but otherwise want to just catch everything else
			}
		}
	}

}