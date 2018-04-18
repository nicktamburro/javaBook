class MinMax2{
	public static void main(String args[]){
		int nums[] = {99, -10, 12343, 18, -978, 56347, 334, 4, -9, 18};
		int min, max;

		min = max = nums[0];
		for (int i=1; i<10; i++){
			if(nums[i] < min) min = nums[i];
			if(nums[i] > max) max = nums[i];
		}
		System.out.println("Min and max: " + min + " " + max);

	}
}