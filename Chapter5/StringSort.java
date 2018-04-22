class StringSort{
	public static void main(String args[]){
		String strings[] = {"fight", "fire", "with", "fire", "ending", "is", "near"};
		int a, b;
		String t;
		int size;

		size = strings.length;

		System.out.print("oringal array is ");
		for (int i=0 ; i<size; i++)
			System.out.print(" " + strings[i]);
		System.out.println();

		for (a = 1; a< size; a++){
			for(b = size - 1; b >= a; b--){
				if (strings[b-1].compareTo(strings[b])>0){
					t = strings[b-1];
					strings[b-1] = strings[b];
					strings[b] = t;
				}
			}
		}
		System.out.print("Sorted array is: ");
		for(int i= 0 ; i<size; i++)
			System.out.print(" " + strings[i]);
			System.out.println();
		
	}
}