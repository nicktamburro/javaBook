class Q{

//TRYING TO ADJUST IT TO TAKE INTS INSTEAD OF CHARS

    //so we make a queue class
    //it has an array, and a putloc and getloc
    int q[];
    int putloc, getloc;

//here the constructor, give it an int for size
    Q(int size){
        //the array is whatever size they give us
        q = new int[size];
        //put and get are both zero, because the queue is empty
        putloc = getloc = 0;
    }

    void put(int num){
        //here are the methods for this class
        //PUT:
        if(putloc == q.length){
            //if the putloc is the last spot, it can't take anymore'
            System.out.println("Sorry, no room.");
            return;
            //so it alerts you and returns out
        }
        //otherwise the character goes in the next spot
           q[putloc++] = num;
    }

    int get(){
        //GET method
        //if they're the same, the queue is empty'
        if(getloc == putloc){
            System.out.println("empty! ");
            //so just return it
            return(int) 0;
        }
        //otherwise, give us what's there'
        return q[getloc++];
    }
}

class IntQDemo{
    //now we actually instantiate it
    //so here comes main
    public static void main(String args[]){
        //we make 2
        Q bigQ = new Q(100);
        Q smallQ = new Q(4);
        //and a ch, and i
        int num;
        int i;

        System.out.println("storing the alphabet in BigQ: ");

        for(i=0; i< 26; i++)
        //so we already said it was a char array, but we have to do this? 
        //so there is a conversion here
        //need to review cast
        //sure okay, so really inside this loop we're just working with numbers 1 - 26
        //but we want them to be letters, so we have to convert it...'
            bigQ.put(i);

        System.out.println("here's what's in bigQ: ");
            for(i=0; i<26; i++){
                //now we print it out
                num = bigQ.get();
                //and have to convert it again on the way out
                if(num != 0) System.out.print(num);
            }

        System.out.println("\n");
    

    System.out.println("making errors in smallQ");
        for(i=0; i<5; i++){
            //because it only has 4 spaces
            //same thing, use a cast since the loop is "thinking" in numbers
            System.out.println("trying" + i);

            
            smallQ.put(i);

            System.out.println();
        }
        System.out.println();

        //more errors
        System.out.print("smallQ: ");
            for(i=0; i<5; i++){
                num = smallQ.get();

                if(num != 0) System.out.print(num);
            }
}

}