class CommandLine{
    public static void main(String[] args){
        System.out.println("There are " + args.length + " arguments.");

        System.out.println("they are: ");
        for(int i =0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }
//SO THEN when we call the program, we give it args
//like: java CommandLine kick out the jams
//and it gives us
//kick
//out
//the
//jams
}