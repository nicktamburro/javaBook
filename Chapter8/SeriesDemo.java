

//now we implement it
class ByTwos implements Series{
	int start;
	int val;

	ByTwos(){
		start = 0;
		val = 0;
	}
//all members of an interact need to be public
	public int getNext(){
		val += 2;
		return val;
	}

	public void reset(){
		val = start;
	}

	public void setStart(int x){
		start = x;
		val = x;
	}
}

class SeriesDemo{
	public static void main(String args[] ){
		ByTwos ob = new ByTwos();

		int i;
		for(i=0; i< 5; i++)
			System.out.println("Next is: " + ob.getNext());

			System.out.println("\nResetting");
			ob.reset();

			for(i=0; i< 5; i++)
				System.out.println("Next is " + ob.getNext());

			System.out.println("\nStarting at 100");
			ob.setStart(100);
			for(i=0 ; i<5; i++)
				System.out.println("Next is " + ob.getNext());
		}
	}
