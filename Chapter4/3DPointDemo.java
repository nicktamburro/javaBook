public class Point{
	double x;
	double y;
	double z;

	public Point(double x, double y, double z){
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

Point p1 = new Point(23.5, 56.4, 87.2);
Point p2 = new Point(1.1, 100.1, 10.1);

}


