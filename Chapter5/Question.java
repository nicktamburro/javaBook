class Question{
    public static void main(String[] args){
        int result;

        for(int i=-5; i<6; i++){

            //ternary (three) operator review
            //first part is boolean
            //so i != 0... true or false?
            result = i != 0 ? 100 / i : 0;
            //if true, it goes to the first expression (100 / i)
            //if false, it goes to the second (0);

            if (i !=0){
                System.out.println("100 / " + i + " is " + result);
            }
        }
    }
}

class Test{
    public static void main(String[] args){
       //declare a one dim array of 12 doubles
       double array[] = new double[12];

       //initialize a 1-dim array of integers 1-5
       int oneToFive[] = {1, 2, 3, 4, 5};

       //
    }
}