//Strings are immutable
class SubString{
    public static void main(String args[]){
        String original = "Here's the original";

        //now we make a substring

        String substr = original.substring(5, 18);
		//so this tell is that we want just the characters
		//between 5 and 18

        System.out.println("1: " + original);
        System.out.println("2: " + substr);
    }
}