//okay, so we're just setting up some arrays

//int sample[] = new int[10];
//type name brackets = new type[size];

//char letters[] = new char[26];
//no need to, but you can
//int sample2[];
//sample2 = new int[10];
//if you wanted to...

//commented all that out, because of course it doesn't work unless it's in a class'

class Arrays{
    public static void main(String args[]){
        //[][][][][][][][][][][][][][][][][][][][][[[[[[[[][]l[][][][][][][][[]o[][][][][]]]]]]]]]
        //practice making brackets quickly^
        int sample[] = new int[10];
        int i;

       /* for(i=0; i<10; i= i+1){
            sample[i] = i;
        }*/

//cool, but why not do that in the same loop
//yeah, same... 
//this loop used to have i=i+1, but i like i++ better
        for(i=0; i <10; i++){
            sample[i] = i;
            System.out.println("This is sample[" + i + "]: " + sample[i]);
        }
    }
}

