class Break3{
	public static void main(String args[]){


		for (int i = 0 ; i < 3 ; i++){
			System.out.println("outer loop count: " + i);
			System.out.print("inner loop count: ");

			int t = 0;
			//t is the inner loop count
			while (t < 100){
				//only do it up to 100, but why?
				if (t == 10) break;
				//once we get to 10, stop, then we'll do another outer loop
				System.out.print(t + " ");
				t++;
			}
			System.out.println();
		}
		System.out.println("loop done");
	}
}