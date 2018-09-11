class TwoDInit{
    public static void main(String args[]){

        //if we wanted to declare multiple arrays at once,
        //we could go
        int[] nums, nums1, nums2;
        
        int sqrs[][]={
            {1,1},
            {2, 4},
            {3, 9},
            {4, 16}
        };
        int i, j;

        for(i=0; i<4; i++)
           for(j=0; j<2; j++)
            System.out.print(sqrs[i][j] + " ");
            System.out.println();
    }
}