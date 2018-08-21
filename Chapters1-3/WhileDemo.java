class WhileDemo{
	public static void main(String args[]){

		char ch;

		ch = 'a';

//so this just prints out all the letters until we reach z
		while(ch <= 'z'){
			System.out.println(ch);
			ch++;
		}
	}
}