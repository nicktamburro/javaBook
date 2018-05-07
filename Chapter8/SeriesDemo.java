

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
		ByTwos twoOb = new ByTwos();
		ByThrees threeOb = new ByThrees();
		Series ob;

		int i;
		for(i=0; i< 5; i++){
			ob = twoOb;  // this is an interface reference;
			//we could also just do ("Next byTwos: " + twoOb.getNex());
			System.out.println("Next byTwos: " + ob.getNext());

			ob = threeOb;   //this is also an interface reference
			//could also just do ("Next byThrees" " + threeOb.getNext());
			System.out.println("Next byThrees: " + ob.getNext());
			
			}
		}
	}
