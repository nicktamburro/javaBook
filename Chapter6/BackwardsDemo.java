//write
//a recursive method that displays the contents of a string backwards

class Backwards{
	String str;

//we can construct a new instance of Backwards
	Backwards(String s){
		str = s;
	}


	void backward(int idx){

		//okay, if the index isn't the last letter, run this again with the index plus 1,
		//until we get to the last letter, then we print it.
		if(idx != str.length()-1) backward(idx+1);

		System.out.print(str.charAt(idx));
		//but after we print it, I don't see what makes it start up again
	}
}

class BackwardsDemo{
	public static void main(String args[]){
		Backwards s = new Backwards("This is a test");

		s.backward(0);
	}
}

