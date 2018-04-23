class Test{
	int a, b;

	Test(int i, int j){
		a = i;
		b = j;
	}
	void change(Test ob){
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
}

class CallByReference{
	public static void main(String args[]){
		Test ob = new Test(15, 20);

		System.out.println("before call: " + ob.a + " " + ob.b);

		ob.change(ob);

		System.out.println("after call: " + ob.a + " " + ob.b);
	}

}