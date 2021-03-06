//NOW we're going to have both super- and sub- classes have constructors

//now this is abstract... 
abstract class TwoDShape{
	//this has private variables, so even subclasses can't get to them... yet
	private double width;
	private double height;
	private String name;	

//a default constructor
	TwoDShape(){
		width = height = 0.0;
		name = "none";
	}

//a parameterized constructor
	//here's the new constructor for TwoDShape
	TwoDShape(double w, double h, String n){
		width = w;
		height = h;
		name = n;
	}

	//construct and object with equal width and height:
	TwoDShape(double x, String n){
		width = height = x;
		name = n;
	}

	TwoDShape(TwoDShape ob){
		width = ob.width;
		height = ob.height;
		name = ob.name;
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

	String getName(){
		return name;
	}
	void showDim(){
		System.out.println("Width and height are: " + width + ", " + height);
	}

//NOW area is abstract, because we need it to be overridden (since each shape has a diffferent
	//way to calculate area... )
	abstract double area();
	//ALSO, and abstract method CANNOT have a body
}

class Circle extends TwoDShape{
	Circle(String n, double w){
		super(w, "circle");
	}

	double area(){
		return getWidth() * getWidth() * 3.14;
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
		super(w, h, "triangle");
		//but suddenly those properties are not private??
		//NO, because w and h are diffferent than "width" and "height" (even though they
		//have the same value)

		style  = s;
	}

	//one argument constructor
	Triangle(double x){
		super(x, "triangle");
		style = "filled";
	}

	Triangle(Triangle ob){
		super(ob);
		style = ob.style;
	}
//now this area() is overriding the area() of TwoDShape...
	double area(){
		return getWidth() * getHeight() / 2;
	}

	void showStyle(){
		System.out.println("Style: " + style);
	}
}

class Rectangle extends TwoDShape{
	Rectangle(){
		super();
	}

	Rectangle(double w, double h){
		super(w, h, "rectangle");
	}

//this makes a square
	Rectangle(double x){
		super(x, "rectangle");
	}

	Rectangle(Rectangle ob){
		super(ob);
	}

	boolean isSquare(){
		if (getWidth() == getHeight()) return true;
return false;
	}
	//this overrides area() for TwoDShape
	double area(){
		return getWidth() * getHeight();
	}
}

class AbstractShapes{
	public static void main(String args[]){
		TwoDShape shapes[] = new TwoDShape[5];

		shapes[0] = new Triangle("outlined", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7.0);
		//not sure why I need to call circle here, I think something else is wrong...
		shapes[4] = new Circle("circle", 5.0);
	

	for(int i=0; i<shapes.length; i++){
		System.out.println("object is " + shapes[i].getName());;
		System.out.println("Area is " + shapes[i].area());
		System.out.println();
	}

	}
}