class StringArrays{
	public static void main(String args[]){
		String strs[] = {"This", "is", "a", "stickup."};

		System.out.println("Original array: ");
		for(String s : strs)
			System.out.print(s + " ");
		System.out.println("\n");

		strs[1] = "can't be";
		strs[3] = "butter";

		System.out.println("Modified array: ");
		for (String s: strs)
			System.out.print(s + " ");
	}
}