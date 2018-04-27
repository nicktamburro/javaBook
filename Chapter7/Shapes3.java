class TwoDShape{
	//this has private variables, so even subclasses can't get to them... yet
	private double width;
	private double height;

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
	String style;

	//adding a Constructor
	Triangle(String s, double w, double h){
		setWidth(w);
		setHeight(h);
		style  = s;
	}

	double area(){
		return getWidth() * getHeight() / 2;
	}

	void showStyle(){
		System.out.println("Style: " + style);
	}
}

class Shapes3{
	public static void main(String args[]){

		//this time, using the constructors to make the object instances
		Triangle t1 = new Triangle("filled", 4.0, 4.0);
		Triangle t2 = new Triangle("outlined", 8.0, 12.0);

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