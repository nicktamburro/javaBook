class BubbleSort{
	public static void main(String args[]){
		int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		int a, b, t;
		int size;

		size = 10;

		System.out.print("oringal array is ");
		for (int i=0 ; i<size; i++)
			System.out.print(" " + nums[i]);
		System.out.println();

//okay so they start a loop counting up from array 1, 99
		for (a = 1; a< size; a++){
			//and as that one counts up, this one counts down from the end
			for(b = size - 1; b >= a; b--){
				//THEN it does the swapping
				if (nums[b-1] > nums[b]){
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		}
		System.out.print("Sorted array is: ");
		for(int i= 0 ; i<size; i++)
			System.out.print(" " + nums[i]);
			System.out.println();
		
	}
}