class MyClass {
	private int alpha;
	public int beta;
	int gamma;

//void, because it doesn't return anything, it just takes input
	void setAlpha(int a){
		alpha = a;
	}
//not void because it DOES return, int b/c it returns an int
	int getAlpha(){
		return alpha;
	}
}

class AccessDemo{
	public static void main(String args[]){
		MyClass ob = new MyClass();

		ob.setAlpha(-99);
		

		//ob.alpha = 10; will NOT work, private, you have to use the accessor method

		ob.beta = 88;
		ob.gamma = 99;

		System.out.println("ob.alpha is " + ob.getAlpha() + " ob.beta and gamma are: " + ob.beta + " " + ob.gamma);


	}
}