/*static void vaTest(int ... v){
	//is it supposed to look like this? 
	System.out.println("NUmber of args: " + v.length);
	system.out.println("contents: " );

	for(int i=0; i<v.length; i++)
		System.out.println(" arg " + i + ": " + v[i]);

	System.out.println();
}*/

class VarArgs{
	static void vaTest(int ... v) {
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