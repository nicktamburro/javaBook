

//now we implement it
class ByTwos implements Series{
	int start;
	int val;
	int prev;

	ByTwos(){
		start = 0;
		val = 0;
		prev = -2;
	}
//all members of an interact need to be public
	public int getNext(){
		prev = val;
		val += 2;
		return val;
	}

	public void reset(){
		val = start;
		prev = start - 2;

	}

	public void setStart(int x){
		start = x;
		val = x;
		prev = x -2;
	}

	int getPrevious(){
		return prev;
	}
}

class ByThrees implements Series{
	int start;
	int val;

	ByThrees(){
		start = 0;
		val = 0;
	}

	public int getNext(){
		val += 3;
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
