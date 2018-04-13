class PrimeHunter{
	public static void main(String args[]){

	int count;

		for (count = 0; count < 101 ; count++){
			if (count == 2 || count == 3 || count == 5 || count == 7){
				System.out.println(count);
			}
			
			if(count > 10){
			 if(count % 2 != 0 && count % 3 != 0 && count % 4 != 0 && count % 5 !=0 && count % 7
				!= 0){
				System.out.println(count);
			}
			}
//okay, I solved it on my own, but here's the book solution:
			/*
			public static void main(String args[]){
				int i, j;
				boolean isprime;

				for (i = 2; i < 100; i++){
					isprime = true;

					for (j = 2; u <= i/j; j++){
	if ((i%j) == 0) isprime = false;

	if(isprime)
	System.out.println(i + " is prime.")
					}
				}

			}


			*/

		}
	}
}