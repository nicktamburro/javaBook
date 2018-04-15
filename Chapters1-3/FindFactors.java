class FindFactors{
	public static void main(String args[]){

		for (int i=2; i<= 100; i++){
			System.out.print("Factors of " + i + ": ");
			for (int j = 3; j<i ; j++)
				if ((i%j) == 0) System.out.print("2 " + j + " ");

			
			System.out.println();
		}
	}
}