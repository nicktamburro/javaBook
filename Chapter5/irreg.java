class Irreg{
    public static void main(String args[]){
        //access available to entired class returns nothing system starts here
        //if we want to have irregular arrays within an array, allocate the second ones later...
        int riders[][] = new int[7][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];


        int i, j;

        //make some fake data
        //we loop through first 5 arrays, and loop 10 times in each
     for (i=0; i<5; i++)
        for (j=0; j<10; j++)
        //and make some stuff
            riders[i][j] = i + j + 10;
            //then we start at 5, and do the last 2
        for(i=5; i < 7; i++)
        //which can only fit 2
            for (j=0; j<2; j++)
                riders[i][j] = i + j + 10;
                    

    System.out.println("Riders during the week: ");
        for(i=0; i< 5; i++){
            for(j=0; j<10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        System.out.println("Riders on the weekend: ");
            for(i=5; i<7; i++)
                for(j=0; j<2; j++)
                    System.out.print(riders[i][j] + " ");
                    System.out.println();;
                
     //to be continued           
        
    }
}