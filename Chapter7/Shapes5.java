//NOW we're going to have both super- and sub- classes have constructors

class TwoDShape{
	//this has private variables, so even subclasses can't get to them... yet
	private double width;
	private double height;

//a default constructor
	TwoDShape(){
		width = height = 0.0;
	}

//a parameterized constructor
	//here's the new constructor for TwoDShape
	TwoDShape(double w, double h){
		width = w;
		height = h;
	}

	//construct and object with equal width and height:
	TwoDShape(double x){
		width = height = x;
	}

	//these are accessor methods
	double getWidth(){
		return width;
	}
	double getHeight(){
		return height;
	}
	void setWidth(double w){
		width = w;
	}
	void setHeight(double h){
		height = h;
	}
	void showDim(){
		System.out.println("Width and height are: " + width + ", " + height);
	}
}

class Triangle extends TwoDShape{
	private String style;

//a default constructor
	Triangle(){
		super();
		style = "none";
	}

	//adding a Constructor
	Triangle(String s, double w, double h){
		//we're calling the superclass' constructor
		super(w, h);
		//but suddenly those properties are not private??
		//NO, because w and h are diffferent than "width" and "height" (even though they
		//have the same value)

		style  = s;
	}

	//one argument constructor
	Triangle(double x){
		super(x);
		style = "filled";
	}

	double area(){
		return getWidth() * getHeight() / 2;
	}

	void showStyle(){
		System.out.println("Style: " + style);
	}
}

class Shapes5{
	public static void main(String args[]){

		//this time, using the constructors to make the object instances
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("outlined", 8.0, 12.0);
		Triangle t3 = new Triangle(4.0);

		System.out.println("t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area: " + t1.area());

		System.out.println();

		System.out.println("t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area: " + t2.area());

		System.out.println("t3: ");
		t3.showStyle();
		t3.showDim();
		System.out.println("Area: " + t3.area());



	}
}