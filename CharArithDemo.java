class CharArithDemo{
	public static void main(String args[]){

		char ch;
		ch = 'X';
		System.out.println("ch contains " + ch);

		ch++;
		System.out.println("ch is now" + ch);

		ch = 90;
		System.out.println("ch is now " + ch);

		ch= 'A';

		int count;
		count = 1;

		for (count = 0 ; count < 26; count++){
			System.out.println(ch);
			ch++;
		}


	}
}