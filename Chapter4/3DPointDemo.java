public class Point{
	public static void Main(String args[]){
	double x;
	double y;
	double z;

	 Point(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	double distance(point1, point2){
		dx = point1.x - point2.x;
		dy = point1.y - point2.y;
		dz = point1.z - point2.z;

		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}


//so these are not contained in anything, they need to be in their own thing!
//Point p1 = new Point(23.5, 56.4, 87.2);
//Point p2 = new Point(1.1, 100.1, 10.1);
}
}

double Points{
	Point p1 = new Point(23.5, 56.4, 87.2);
    Point p2 = new Point(1.1, 100.1, 10.1);

    System.out.println(p1.distance + " " + p2.distance);
}
