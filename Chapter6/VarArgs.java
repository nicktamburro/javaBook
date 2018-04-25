/*static void vaTest(int ... v){
	//is it supposed to look like this? 
	System.out.println("NUmber of args: " + v.length);
	system.out.println("contents: " );

	for(int i=0; i<v.length; i++)
		System.out.println(" arg " + i + ": " + v[i]);

	System.out.println();
}*/

class VarArgs{
						//this is how you write it when you don't know how many arguments you'll get
	static void vaTest(int ... v) {
	//when we do a varargs thing, the arguments become an array, that's how they're stored... 
		//that's why we can use v[i], and maybe .length too
		System.out.println("Number of args: " + v.length);
		System.out.println("contents: ");

		for (int i=0 ; i<v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);

		System.out.println();
	}

	//haven't seen public static void main called down here before... 
	public static void main(String args[]){
		vaTest(10);
		vaTest(1, 2, 3);
		vaTest();
	}
}