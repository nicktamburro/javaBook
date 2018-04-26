//shows the class Queue
class Stack{
	private char s[]; //this is the array that acts as stack
	private int tos; //top of stack

//constructor for Queue
	Stack(int size){
		s = new char[size];// NOT SURE WHY THIS? OH, it's makeing a new character array and letting you say how big
		tos = 0; // sets both to zero at first
	}

	//construct a stack from a stack:
	//takes the stack and copies everything from it
	Stack(Stack ob){
		tos = ob.tos;
		s = new char[ob.s.length];

		for(int i = 0; i<tos; i++)
			s[i] = ob.s[i];	
	}

	//construct a Queue with initial values:
	Stack(char a[]){
		s = new char[a.length];

		for(int i = 0; i<a.length;i++) push (a[i]);
	}
	//push characters onto the stack
	void push(char ch){
		if(tos == s.length){//if place to put character is the last spot in the array, the array is full
			System.out.println(" -- Stack is full.");
			return; //so it alerts and takes no action
		}
	   s[tos] = ch; //if there's room, it puts the character there
	   tos++;
}
	   char pop() {//GET METHOC
	   	if(tos ==0){   //if the place to Get from is the final spot, there's nothing there to get
	   		System.out.println(" -- stack is empty");
	   		return (char) 0;  //so nothing happens
	   	}
	   	tos--;
	   	return s[tos];
	   }
	}

	class StackDemo{
		public static void main(String args[]){
			
			Stack s1 = new Stack(10);

			char name[] = {'T', 'O', 'M'};
			//construct a Queue from an array
			Stack s2 = new Stack(name);

			char ch;
			int i;

			//put some characters into q1
			for(i=0; i< 10; i++)
				s1.push((char) ('A' + i));

			//make a queue from a queue
			Stack s3 = new Stack(s1);

			//show the queues
			System.out.print("s1: ");
			for (i=0 ; i<10; i++){
				ch = s1.pop();

				System.out.print(ch);
			}

			System.out.println("\n");

			System.out.print("s2: ");
			for(i=0; i< 3; i++){
				ch = s2.pop();
				System.out.print(ch);
			}

			System.out.println("\n");

			System.out.print("s3: ");
			for(i=0; i<10; i++){
				ch = s3.pop();
				System.out.print(ch);
			}

		}
	}
