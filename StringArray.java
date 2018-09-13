class StringArray{
    public static void main(String args[]){
        String strs[]= {"This", "is", "a", "test."};

        System.out.println("Original array: ");
            for(String s : strs)
                System.out.print(s + " ");
            System.out.println("\n");

            //changing the string now
            strs[1] = "isn't";
            strs[3] = "dream.";

            System.out.println("Modified: ");
                for(String s: strs)
                    System.out.print(s + " ");
    }
}