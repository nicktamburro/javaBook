//everything is inside a class
class BlockDemo{
//this is just how we get it going, "main" is important
	public static void main(String args[]){
		//declaring variables, we have to say what kind they are
		double i, j, d;

		//and then we can be even more specific, what they are assigned to
		i = 5;
		j = 10;

//if i !=0 (to avoid a divide by zero)
		if (i != 0){
			//tell us
			System.out.println("i does not equal zero");
			d = j / i;
			//then divide and tell us...
			System.out.println("j / i is " + d);
		}
	}
}