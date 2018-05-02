//method overriding,
//so when a method in a subclass has same return type and signature as its superclass
//the subclass will always win, if it's called from the subclass
//
//for now I'm thinking of it as, it uses the CLOSEST version to the call
//let's see:

class A{
	int i, j;
	A(int a, int b){
		i = a;
		j = b;
	}

	void show(){
		System.out.println("i and j: " + i + " " + j);
	}
}

//here's our subclass
class B extends A{
	int k;
	B(int a, int b, int c){
		super(a, b);
		k = c;
	}

	void show(){
		//this will override the above show()
		System.out.println("k: " + k);
		//if you wanted to call the show() from A
		//you could write:
		//super.show();
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1

	}
}

class Override{
	public static void main(String args[]){
		B subOb = new B(1, 2, 3);
//this below will call the show() from B
		subOb.show();

	}
}

