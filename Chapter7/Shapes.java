//this is the superclass
class TwoDShape{
	double width, height;

	void showDim(){
		System.out.println("Width and height: " + width + " & " + height);
	}
}

//this is the subclass which inherits width and height from TwoDShape
class Triangle extends TwoDShape{
	//and now gets a style property, which TwoDShape doesn't have
	String style;

	double area() {
		return width * height / 2;
	}

	void showStyle(){
		System.out.println("Triangle is " + style);
	}
}

class Shapes{
	public static void main(String args[]){
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();

		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "filled";

		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "outlined";

		System.out.println("t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area: " + t1.area());

		System.out.println();

		System.out.println("t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area: " + t2.area());
	}
}