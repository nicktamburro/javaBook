class Test{
	//this causes no change to the arguments, it is "passed by value"
	void noChange(int i, int j){
		i = i + j;
		j = -j;
}

class CallByValue{
	public static void main(String args[]){
		Test ob = new Test();
		int a = 15, b = 20;

		

		System.out.println("before call: " + a + " " + b);

		ob.noChange(a, b);

		System.out.println("after call: " + a + " " + b);
	}
}