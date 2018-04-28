class BubbleSort2{
	public static void main(String args[]){

int nums [] = {5, 6, 4, 6, 3, 12, 1};
	
Boolean swap = false;
do{
	

	for(int i = 1; i<nums.length ; i++){
		//do this part backwards now.... 
		if (nums[i - 1] > nums[i]){
			int t = nums[i];
			nums[i] = nums[i-1];
			nums[i-1] = t;
			swap = true;
		}else{
			swap = false;
		}
	}
}while(swap == true);

System.out.print("Sorted: ");
for(int j=0 ; j<nums.length ; j++)
System.out.print(nums[j] + " ");
}
}
