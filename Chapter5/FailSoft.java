class FailSoftArray{
    //we declare an array and a couple ints
    private int a[];
    //this one is the error value, aka what we return if it fails
    private int errval;
    public int length;
    //length is public

//this is how we construct one, given a size and error val
    public FailSoftArray(int size, int errv){
        //not sure why we have size AND length
        //but we make a new array called a
        a = new int[size];
        errval = errv;
        length = size;
        //etc.
    }

    //public method to get something from it
    public int get(int index){
        //I don't understand where this indexOK comes from'
        //we never define it anywhere...
        //we DO define it, under put
        if(indexOK(index)){
            //but anyway, if the index is "ok" return it
            return a[index];
        }else{
            //if not, return the error value
            return errval;
        }
    }

//here's the method to put something into the array'
    public boolean put(int index, int val){
        //if the index is okay, put the value in that index
        if(indexOK(index)){
            a[index] = val;
            return true;
        }else{
            return false;
        }
    }

    private boolean indexOK(int index){
        //if it's greater than zero, and less than length, index is okay'
        if(index>=0 & index < length){
            return true;
        }else{
            return false;
        }
    }
}

class FailSoft{
    public static void main(String[] args){
        //here's a new array, it has 5 spaces, give us a -1 if it fails'
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

//now we're going to loop through an array twice as long as it's allowed to be
        System.out.println("Fail quietly: ");
        for (int i=0; i<(fs.length * 2); i++){
            //we tell it to put multiples of 10 in there
            fs.put(i, i*10);
            
        }
        for (int i=0; i < (fs.length * 2); i++){
            //and then print them out, if they're not -1'
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            //just don't tell us about the failed ones'
        }
        System.out.println("");

        System.out.println("\nFail with error reports: ");
        //now do the same thing, but tell us when it fails
        for (int i=0; i<(fs.length * 2); i++){
            if(!fs.put(i, i*10))
            //the put was false, meaning it didn't work, tell us
            //it didn't work because there wasn't enough room'
                System.out.println("Index " + i + " out-of-bounds.");
        }

        for(int i=0; i < (fs.length * 2); i++){
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
            else
                System.out.println("Index " + i + " out-of-bounds.");
        }
        
        
    }
}