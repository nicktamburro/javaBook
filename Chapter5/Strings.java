class Strings{
    public static void main(String args[]){
        //here are some ways to declare strings
        String str1 = new String("You can do a 'new' kind of thing, because Strings are objects");
        String str2 = "you can also just do this, more like JS";
        String str3 = new String(str2); //or assign it to something like this

        System.out.println("1: " + str1 + " 2: " + str2 + " 3: " + str3);
    }
}