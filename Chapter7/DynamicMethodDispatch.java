class Super{
	void who(){
		System.out.println("who() in super");
	}
}

class Sub1 extends Super{
	void who(){
		System.out.println("who() in Sub1");
	}
}

class Sub2 extends Super{
	void who(){
		System.out.println("who() in Sub2");
	}
}

class DynamicMethodDispatch{
	public static void main(String args[]){
			Super superobj = new Super();
			Sub1 subOb1 = new Sub1();
			Sub2 subOb2 = new Sub2();

//I don't understand just calling super like this...
			//okay (kind of), this is called a "reference of type Super"
			Super supRef;

			//i understand why this all works, but not
			//why it's very significant

			supRef = superobj;
			supRef.who();

			supRef = subOb1;
			supRef.who();

			supRef = subOb2;
			supRef.who();

	}
}