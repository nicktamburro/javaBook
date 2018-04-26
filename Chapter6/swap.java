//given this class
class Test{
	int a;
	Test(int i) {a = i;}
}

//write a method called swap() that exchanges the contents of the objects refferd to by two Test object references

void swap(Test ob1, Test ob2){
	Test ob1 = new Test(5);
	Test ob2 = new Test(10);

	System.out.println("at first, ob1 = " + ob1.a + " and ob2 = " + ob2.a);

	int temp = ob1.a;
	ob1.a = ob2.a;
	ob2.a = temp;


}