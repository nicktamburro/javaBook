class DWDemo{
	public static void main(String args[])
	throws java.io.IOException{
		char ch;

		do{
			System.out.println("Pick a letter: ");
			ch = (char) System.in.read();
		}while(ch != 'q');

	}
}