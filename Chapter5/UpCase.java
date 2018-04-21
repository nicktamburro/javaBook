class UpCase{
	public static void main(String args[]){
		char ch;

		for(int i =0; i< 10 ; i++){
			ch = (char) ('a' + i);
			System.out.print(ch);

			//THIS STATEMENT turns off the 6th bit (read up on this......)

			ch = (char) ((int) ch & 65503); //ch is now uppercase... why?

			System.out.print(ch + " ");
		}

	}
}