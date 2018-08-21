class SwitchDemo{
	public static void main(String args[]){
		int i;

		//loop 10 times
		for (i=0; i<10; i++)
			//take in i
			switch(i){
				//do these things when i = any of them...
			case 0:
				System.out.println("i is zero");
				break;
			case 1:
				System.out.println("i is one");
				break;
			case 2:
				System.out.println("i is two");
				break;
			case 3:
				System.out.println("i is three");
				break;
			case 4:
				System.out.println("i is four");
				break;
			default:
				System.out.println("i is five or more");
		}
	}
}