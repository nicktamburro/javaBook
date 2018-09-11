class Q{

    //so we make a queue class
    //it has an array, and a putloc and getloc
    char q[];
    int putloc, getloc;

//here the constructor, give it an int for size
    Q(int size){
        //the array is whatever size they give us
        q = new char[size];
        //put and get are both zero, because the queue is empty
        putloc = getloc = 0;
    }

    void put(char ch){
        //here are the methods for this class
        //PUT:
        if(putloc == q.length){
            //if the putloc is the last spot, it can't take anymore'
            System.out.println("Sorry, no room.");
            return;
            //so it alerts you and returns out
        }
        //otherwise the character goes in the next spot
           q[putloc++] = ch;
    }

    char get(){
        //GET method
        //if they're the same, the queue is empty'
        if(getloc == putloc){
            System.out.println("empty! ");
            //so just return it
            return(char) 0;
        }
        //otherwise, give us what's there'
        return q[getloc++];
    }
}

class QDemo{
    //now we actually instantiate it
    //so here comes main
    public static void main(String args[]){
        //we make 2
        Q bigQ = new Q(100);
        Q smallQ = new Q(4);
        //and a ch, and i
        char ch;
        int i;

        System.out.println("storing the alphabet in BigQ: ");

        for(i=0; i< 26; i++)
        //so we already said it was a char array, but we have to do this? 
        //so there is a conversion here
        //need to review cast
            bigQ.put((char) ('A' + i));

        System.out.println("here's what's in bigQ: ");
            for(i=0; i<26; i++){
                ch = bigQ.get();
                if(ch != (char) 0) System.out.print(ch);
            }

        System.out.println("\n");
    

    System.out.println("making errors in smallQ");
        for(i=0; i<5; i++){
            //because it only has 4 spaces
            System.out.println("trying" + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        //more errors
        System.out.print("smallQ: ");
            for(i=0; i<5; i++){
                ch = smallQ.get();

                if(ch != (char) 0) System.out.print(ch);
            }
}

}