class FixedQueue implements ICharQ{
	private char 1[];
	private int putloc, getloc;

//contruct an empty queue given a size
	public FixedQueue(int size){
		 q = new char[size];
		 putloc = getloc = 0;
	}

//put a character into the queue
	public void put(char ch)
		throws QueueFullException{
			if (putloc==q.length)
				throw new QueueFullException(q.length);

			q[putloc++] = ch;
		}


}

