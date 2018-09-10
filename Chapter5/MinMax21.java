class MinMax21{//set up a class
    public static void main(String args[]){
        //public = access, static = shared across all instances of class, 
        //void = what it returns, main = where it starts, (what args it takes);

        //then we make our new array
        int nums[] = new int[5];
        //and set up min and max
        int min, max;

//assign values
        nums[0] = 99;
        nums[1] = 20;
        nums[2] = -100;
        nums[3] = 234;
        nums[4] = 1000;

        min = max = nums[0];
        //set everything at zero

//loop through and replace min and max with the values
        for(int i = 1; i<5; i++){
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        //tell us what you found
        System.out.println("min = " + min + " and max = " + max);
    }
}