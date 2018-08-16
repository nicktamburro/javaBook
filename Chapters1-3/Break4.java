class Break4{
	public static void main(String args[]){

		int i;

		for (i = 1; i< 4; i++){

			//these are blocks... review this
			one: {
				two: {
					three: {
						System.out.println("\ni is " + i);
						if(i == 1) break one;
						if(i == 2) break two;
						if(i == 3) break three;

						System.out.println("you can't see me");
					}
					System.out.println("after block 3");
				}
				System.out.println("after block 2");
			}
			System.out.println("after block 1");
		}
		System.out.println("after for");


	}
}