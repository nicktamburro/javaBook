class MinMax21{
    public static void main(String args[]){
        int nums[] = new int[5];
        int min, max;

        nums[0] = 99;
        nums[1] = 20;
        nums[2] = -100;
        nums[3] = 234;
        nums[4] = 1000;

        min = max = nums[0];
        //set everything at zero

        for(int i = 1; i<5; i++){
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("min = " + min + " and max = " + max);
    }
}