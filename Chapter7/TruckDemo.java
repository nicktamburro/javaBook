class Vehicle{
	private int passengers;
	private int fuelcap;
	private int mpg;

	//constructor for Vehicle
	Vehicle(int p, int f, int m){
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	//returns the range
	int range(){
		return mpg * fuelcap;
	}

	//calculates fuel needed
	double fuelneeded(int miles){
		return (double) miles / mpg;
	}

	//accessor methods for instances
	int getPassengers(){return passengers; }
	void setPassengers(int p){passengers = p; }
	int getFuelcap(){return fuelcap; }
	void setFueldcap(int f){fuelcap = f; }
	int getMpg(){return mpg;}
	void setMpg(int m){mpg = m;}

}

//extend to a Truck subclass
class Truck extends Vehicle{
	private int cargocap;

	//constructor
	Truck(int p, int f, int m, int c){
		//calling the first three from superclass Vehicle
		//remember super gets called first
		super(p, f, m);

		cargocap = c;
	}

	//accessor methods
	int getCargo(){return cargocap;}
	void putCargo(int c){cargocap = c;}
}

class TruckDemo{
	public static void main(String args[]){

		//construct some trucks
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		double gallons;
		int dist = 252;

		gallons = semi.fuelneeded(dist);

		System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
		System.out.println("To go " + dist + " miles, semi needs " + gallons + " gallons of fuel.");

		gallons = pickup.fuelneeded(dist);

		System.out.println("Pickup can carry " + pickup.getCargo() + " pounds.");
		System.out.println("To go " + dist + " miles, pickup needs " + gallons + " gallons of fuel.");
	}
}


















