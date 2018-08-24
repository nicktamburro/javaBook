class FindFactors{
	public static void main(String args[]){

		//okay a little more interesting, a double loop
		//we loop once going from 2 to 100

		for (int i=2; i<= 100; i++){
			System.out.print("Factors of " + i + ": ");
			//factors of each number,
			//then loop again starting with 3
			for (int j = 3; j<i ; j++)
				//and if there's no remainder, then yes! it is a factor
				if ((i%j) == 0) System.out.print("2 " + j + " ");

			
			System.out.println();
		}
	}
}