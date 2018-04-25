class Static{
	int x;
	static int y;

	int sum(){
		return x+y;
	}
}

class StaticDemo{
	public static void main(String args[]){

		Static ob1 = new Static();
		Static ob2 = new Static();

		ob1.x = 10;
		ob2.x = 20;
		System.out.println("ob1 and ob2 are independent");
		System.out.println("ob1.x: " + ob1.x + "\n ob2.x: " + ob2.x);
		System.out.println();

		System.out.println("but the static variable is shared, set it to 19, and...");
		Static.y = 19;

		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());

		Static.y = 100;
		System.out.println("now y is 100");
		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();
	}
}