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
			

			public static void main(String args[]){
				//two variables and a boolean
				int i, j;
				boolean isprime;

				//start at 2, go up to 100
				for (i = 2; i < 100; i++){
					//isprime is true
					isprime = true;


			//this is the line I don't understand yet...
					//loop starting with 2, j has to be less than i/j, which is looping too
					for (j = 2; j <= i/j; j++){
						//so, if i is divisible by anything before it, it's not prime... 
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