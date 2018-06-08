class UseFinally{
	public static void genException(int what){
		int t;
		int nums[] = new int[2];

		System.out.println("Receiving " + what);
		try{
			switch(what){
				case 0:
				t = 10 / what; // generate div by zero error
				break;
				case 1:
				nums[4] = 4; //generate array index error
				break;
				case 2:
				return; // return from try block
			}
		}
		catch (ArithmeticException exc){
			//catch it
			System.out.println("Can't divide by zero!");
			return; // return from catch
		}
		catch (ArrayIndexOutOfBoundsException exc){
			//catch it
			System.out.println("No matching element found.");
			System.out.println("Because there aren't that many numbers in the array.");
		}
		finally {
			System.out.println("Leaving try.");
		}
	}
}

class FinallyDemo{
	public static void main(String args[]){
		for (int i=0; i<3; i++){
			//pay attention to this... genException()... read up on it
			UseFinally.genException(i);
			System.out.println();
		}
	}
}