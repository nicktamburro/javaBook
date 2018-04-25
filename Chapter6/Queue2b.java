//shows the class Queue
class Queue{
	private char q[]; //this is the array that acts as queue
	private int putloc, getloc; //the array index that Put and Get will target

//constructor for Queue
	Queue(int size){
		q = new char[size];// NOT SURE WHY THIS? OH, it's makeing a new character array and letting you say how big
		putloc = getloc = 0; // sets both to zero at first
	}

	//construct a Queue from a Queue:
	//takes the Queue and copies everything from it
	Queue(Queue ob){
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];

		for(int i=getloc; i<putloc; i++)
			q[i] = ob.q[i];	
	}

	//construct a Queue with initial values:
	Queue(char a[]){
		putloc = 0;
		getloc = 0;
		q = new char[a.length];

		for(int i = 0; i<a.length;i++) put (a[i]);
	}
	//PUT method
	void put(char ch){
		if(putloc==q.length){//if place to put character is the last spot in the array, the array is full
			System.out.println(" -- Queue is full.");
			return; //so it alerts and takes no action
		}
	   q[putloc++] = ch; //if there's room, it puts the character there
}
	   char get() {//GET METHOC
	   	if(getloc == putloc){   //if the place to Get from is the final spot, there's nothing there to get
	   		System.out.println(" -- Queue is empty");
	   		return (char) 0;  //so nothing happens
	   	}
	   	return q[getloc++];  //this again... 
	   }
	}

	class Queue2b{
		public static void main(String args[]){
			
			Queue q1 = new Queue(10);

			char name[] = {'T', 'O', 'M'};
			//construct a Queue from an array
			Queue q2 = new Queue(name);

			char ch;
			int i;

			//put some characters into q1
			for(i=0; i< 10; i++)
				q1.put((char) ('A' + i));

			//make a queue from a queue
			Queue q3 = new Queue(q1);

			//show the queues
			System.out.print("q1: ");
			for (i=0 ; i<10; i++){
				ch = q1.get();

				System.out.print(ch);
			}

			System.out.println("\n");

			System.out.print("q2: ");
			for(i=0; i< 3; i++){
				ch = q2.get();
				System.out.print(ch);
			}

			System.out.println("\n");

			System.out.print("q3: ");
			for(i=0; i<10; i++){
				ch = q3.get();
				System.out.print(ch);
			}

		}
	}
