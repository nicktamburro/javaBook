class MetallicaDirectory{
	public static void main(String args[]){
		String numbers[][] = {
			{"Lars", "363-8073"},
			{"Cliff", "363-7119"},
			{"James", "363-5424"},
			{"Dave", "363-5434"}
		};
		int i;
		

		if(args.length != 1)
				System.out.println("type 'Java MetallicaDirectory' and then <name of original Metallica member>");
		else{
			for(i=0; i<numbers.length;i++){
				if(numbers[i][0].equals(args[0])){
					System.out.println(numbers[i][0] + ": " + numbers[i][1]);
				break;
				}
			}
			//can't get this Kirk message to show....
			if(args[0] == "Kirk")
			System.out.println("The original lead guitarist of Metallica was named Dave.");
			if(i == numbers.length)
				System.out.println("That's not an original Metallica member.");
		}
	}
}