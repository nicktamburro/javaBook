//fixed-size queue
class FixedQueue implements ICharQ{
	private char q[]; //this array holds the queue
	private int putloc, getloc; // the put and get indices

	//Consruct an empty queue of a given size
	public FixedQueue(int size){
		q = new char[size]; //allocated memory for queue
		putloc = getloc = 0;
	}

	//method to enter a character into queue
	public void put(char ch){
	//if the queue is full, print this message
		if(putloc==q.length){
			System.out.println(" - Queue is full.");
			return;
		}
		//if it's NOT full, put the character in the next open spot
		q[putloc++] = ch;
	}

	//method to get a character out
	public char get(){
		//if the first spot in the queue is empty, there's nothing to get
		if(getloc == putloc){
			System.out.println(" - Queue is empty");
			return (char) 0;
		}
		//if it's NOT empty, return the thing in that spot
		return q[getloc++];
	}
}

//NOW we make a Circular Queue
class CircularQueue implements ICharQ{
	private char q[]; //this array holds the queue
	//they're all called q, it's okay because they're private
	private int putloc, getloc; //setting up the put and get for this one

	//construct a queue, given a size
	public CircularQueue(int size){
		q = new char[size+1];
		//not sure why size+1...
		putloc = getloc = 0;
	}

	//put()
	public void put(char ch){
		//if queue is full...
		if(putloc+1==getloc | ((putloc==q.length+1) & (getloc==0))){
			//+1 because we need to avoid overwriting something that hasn't been returned yet...
//SO 
			System.out.println("- Queue is full.");
			return;
		}

		q[putloc++] = ch;
		if(putloc==q.length) putloc = 0; //loop back
	}

	public char get(){
		if(getloc == putloc){
			System.out.println("- Queue is empty");
			return (char) 0;
		}
		char ch = q[getloc++];
		if(getloc == q.length) getloc = 0; //loop back
		return ch;
	}
}

//now we make a "growable" queue, a dynamic queue
class DynQueue implements ICharQ{
private char q[];
private int putloc, getloc;


public DynQueue(int size){
	q = new char[size];
	putloc = getloc = 0;
}

public void put(char ch){
	if (putloc == q.length){
		//increase queue size
		//if the queue is full, we create a NEW queue (t for temp) that's twice the size of q
		char t[] = new char[q.length * 2];

		//then we copy elements into new queue
		for(int i=0; i<q.length; i++)
			t[i] = q[i];

		//THEN we make q a reference to t
		q = t;
	}

	q[putloc++] = ch;
}

public char get(){
	if(getloc == putloc){
		System.out.println(" - Queue is empty");
		return (char) 0;
	}

	return q[getloc++];
}

}

//now we use it
class IQDemo{
	public static void main(String args[]){
		FixedQueue q1 = new FixedQueue(10);
		DynQueue q2 = new DynQueue(5);
		CircularQueue q3 = new CircularQueue(10);

		ICharQ iQ; // why?
		//doing this again, where we make a new reference, instead of just using q1 directly

		char ch;
		int i;

		iQ = q1;
		//put some characters in
		for(i=0; i<10; i++)
			iQ.put((char) ('A' + i));

		//show the Queue
		System.out.print("Fixed Queue: ");
		for(i=0; i<10; i++){
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();

		iQ = q2;
		//put some characters in
		for(i=0; i<10; i++)
			iQ.put((char) ('A' + i));

		//show the Queue
		System.out.print("Dynamic Queue: ");
		for(i=0; i<10; i++){
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();

		iQ = q3;
		//put characters into circular
		for(i=0; i<10; i++)
			iQ.put((char) ('A' + i));

		//show it
		System.out.print("Circular Queue: ");
		for(i=0; i<10; i++){
			ch = iQ.get();
			System.out.print(ch);
		}

			System.out.println();

			//put MORE in
		for(i=10; i<20; i++)
			iQ.put((char) ('A' + i));

		//show
		System.out.print("Circular queue: ");
		for(i=0; i<10; i++){
			ch = iQ.get();
			System.out.print(ch);
		}

		System.out.println("\nstore and consume from Circular Queue");

		for(i=0; i<20; i++){
			iQ.put((char)('A' + i));
			ch = iQ.get();
			System.out.print(ch);

		}
	



	}
}
