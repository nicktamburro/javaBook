class Vehicle{
	int passengers;
	int fuelcap;
	int mpg;

	int range(){
		return fuelcap * mpg;
	}

	double fuelneeded(int miles){
		return (double) miles / mpg;
	}
}

class VehicleDemo{
	public static void main(String args[]){

		Vehicle minivan = new Vehicle();
		Vehicle delorian = new Vehicle();
		double gallons;
		int dist = 252;

		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		delorian.passengers = 2;
		delorian.fuelcap = 1000;
		delorian.mpg = 2000000;

		gallons = minivan.fuelneeded(dist);

		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + minivan.range() + " miles!");
		System.out.println("To go " + dist + " miles, minivan needs " + gallons + " gallons of fuel");

		gallons = delorian.fuelneeded(dist);
		System.out.println("Delorian can carry " + delorian.passengers + " with a range of " + delorian.range() + " miles!");
		System.out.println("To go " + dist + " miles, minivan needs " + gallons + " gallons of fuel");
	}
}