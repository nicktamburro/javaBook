class FixedQueue implements ICharQ{
	//I think I might have to rework the file structure here... ICharQ is in the Chapter8
	//folder
	private char 1[];
	//this line looks wrong... =?
	private int putloc, getloc;
	//just initializing array indecies

//contruct an empty queue given a size
	public FixedQueue(int size){
		 q = new char[size];
		 putloc = getloc = 0;
		 //since it starts off empty, they're both at index zero
	}

//put a character into the queue
	public void put(char ch){
		//here we make our own new exception
		throws QueueFullException{
			//and HERE we define when it happens!
			if (putloc==q.length)
				throw new QueueFullException(q.length);

			q[putloc++] = ch;
		}
	}


}

