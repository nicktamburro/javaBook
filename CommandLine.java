class CommandLine{
    public static void main(String[] args){
        System.out.println("There are " + args.length + " arguments.");

        System.out.println("they are: ");
        for(int i =0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }
}