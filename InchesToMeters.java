// 1 meter = 39.37 inches

class InchesToMeters{
	public static void main(String args[]){

	int count;
	double inches;


	count = 0;
	for (inches = 1 ; inches <= 144 ; inches++){

		System.out.println(inches + " inches equals " + inches * 0.0254 + " meters!");

		count++;
		if (count == 12){
			System.out.println();
			count = 0;
		}
	}
	}
}