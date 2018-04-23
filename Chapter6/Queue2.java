//shows the class Queue
class Queue{
	private char q[]; //this is the array that acts as queue
	private int putloc, getloc; //the array index that Put and Get will target

//constructor for Queue
	Queue(int size){
		q = new char[size];// NOT SURE WHY THIS? OH, it's makeing a new character array and letting you say how big
		putloc = getloc = 0; // sets both to zero at first
	}
	//PUT method
	void put(char ch){
		if(putloc==q.length){//if place to put character is the last spot in the array, the array is full
			System.out.println(" -- Queue is full.");
			return; //so it alerts and takes no action
		}
	   q[putloc++] = ch; //if there's room, it puts the character there, but 1[putlocc++] I've never seen
	   //an increment like that before... 
}
	   char get() {//GET METHOC
	   	if(getloc == putloc){   //if the place to Get from is the final spot, there's nothing there to get
	   		System.out.println(" -- Queue is empty");
	   		return (char) 0;  //so nothing happens
	   	}
	   	return q[getloc++];  //this again... 
	   }
	}

	class Queue2{
		public static void main(String args[]){
			Queue bigQ = new Queue(100);   //constructing new Q objects
			Queue smallQ = new Queue(4);
			char ch;
			int i;

			System.out.println("Using bigQ to store alphabet");
			for(i=0; i<26; i++){  
				bigQ.put((char) ('A' + i));  //a loop, a casee, puts in the alphabet.... 
			}

			System.out.print("Contents of BigQ: ");
			for (i=0 ; i<26; i++){
				ch = bigQ.get();
				if(ch != (char) 0) System.out.print(ch);
			}
		System.out.println("\n");

		System.out.println("SmallQ to generate errrors");

		for(i=0; i<5; i++){
			System.out.print("Attempting to store " + (char) ('Z' - i));

			smallQ.put((char) ('Z' - i));

			System.out.println();
		}
		System.out.println();

		System.out.print("contents of smallQ:");
		for(i=0; i<5; i++){
			ch = smallQ.get();

			if(ch != (char) 0) System.out.print(ch);
		}

		}
	}
