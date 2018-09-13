class WorkWithStrings{
    public static void main(String args[]){
        String str1 = "Here is string 1";
        String str2 = new String(str1 + "  but now it's string 2");
        String str3 = "This is String 3.";
        int result, idx;
        char ch;

System.out.println("String one length is " + str1.length());

//REMEMBER the () after length, it's a function so we need that'

//now we loop through string1 and print one character at a time!
for(int i=0; i< str1.length(); i++){
    System.out.print(str1.charAt(i));
 
}
System.out.println();

if (str1.equals(str2)){
    System.out.println("String1 equals String2.");
}else{
    System.out.println("String1 doesn't equal String2");
}

if(str1.equals(str3)){
    System.out.println("String1 equals String3.");
}else{
    System.out.println("String1 doesn't equal String3.");
}

result = str1.compareTo(str3);
    if(result ==0)
        System.out.println("strings 1 and 3 are equal.");
    else if(result <0)
        System.out.println("string 1 is less than string 3");
    else
        System.out.println("string 1 is longer");

    str2 = "Now THIS is String 2, this is cool.";

    idx = str2.indexOf("is");
    System.out.println("first occurrence of 'is' is at index " + idx);
    idx = str2.lastIndexOf("is");
    System.out.println("last occurrence of 'is' is at index " + idx);



    }
}