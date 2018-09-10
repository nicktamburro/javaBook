class TwoDim{
    public static void main(String args[]){

        //now we're talking about 2 dimensional arrays
        //we declare then like this, below, with the two []s

        //but I'm still having trouble imagining them... '
        int t, i;
        int table[][] = new int[3][4];
        //okay yeah, so it's an array that has
        //THREE arrays inside it, 
        //and each inside array has FOUR spots in it

//okay hey look, doing the ++t makes it different than the t++... it's not interchangable
//
//because when i did t++, it gave me 4 arrays, which it wasn't supposed to do
//so now read up on ++i vs i++
//KIND OF get it, but so after lunch task is to really understand why it makes this difference
//okay I'm crazy, it actually doesn't make a difference

        for(t=0; t<3;t++){
            for (i=0; i<4; i++){
                table[t][i] = (t*4)+i+i;
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }
    }

}