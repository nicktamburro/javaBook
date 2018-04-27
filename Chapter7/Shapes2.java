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

	double area(){
		return getWidth() * getHeight() / 2;
	}

	void showStyle(){
		System.out.println("Style: " + style);
	}
}

class Shapes2{
	public static void main(String args[]){
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();


//so to set or get the height or width private variables, need to use these methods
		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = "filled";
	}
}