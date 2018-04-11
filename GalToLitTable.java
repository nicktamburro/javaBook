class GalToLitTable{
	public static void main(String args[]){

		double count;

		for (count = 1; count < 101; count++)
		
		if (count % 10 == 0){
			System.out.println(count + " gallons equals " + count * 3.7854 + " liters");
			System.out.println();
			}
			else{
				System.out.println(count + " gallons equals " + count * 3.7854 + " liters");
			}

	}
}