class ForEachTwo{

    //pretty straightforward, but remember a "for each" loop in READ ONLY
    //it can't change the array the way a for loop can'
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        //for each loop
        for(int x : nums){
            System.out.println("Value is: " + x);
            sum += x;
        }

        System.out.println("Sum is " + sum);
    }
}