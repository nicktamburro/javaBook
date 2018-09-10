class NewBubbles{
    public static void main(String args[]){
        int nums[] = {99, 100, -100, 1, 234};
        int a, b, temp;
        int size = 5;

//okay yeah so I did it the javascript way...
//now learn the java way:
//okay, so we start a loop at 1... if we start at 0 we go out of bounds

//starts at 1 and goes up to the end
        for(a = 1; a<size; a++ ){
            //now b starts at the last, stops at A!
            //so it can compare 1 to 0, last of all
            for(b = size - 1; b>=a; b--){
                //then we see if we need a swap!
                if(nums[b-1] > nums[b]){
                    temp = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = temp;
                }
            }
        }


        for(int i=0; i<nums.length; i++){
            System.out.println("now it should be sorted: " + nums[i]);
        }
    }
}