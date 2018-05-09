public interface Series{
	//we're just delcaring methods that the classes will use,
	//kind of like abstract, they aren't defined...
	int getNext();

	//now we're making a default interface method
	//so that none of the implementations need to call it... it can take care
	//of itself
	default int[] getNextArray(int n);{
		//we're creating a new array called vals, which fits "n" integers
		int[] vals = new int[n];

		//for all the integers that get made, they push them into the array...
		for (int i=0; i<n; i++)
			vals[i] = getNext();
		//and we return the array
		return vals;
	}


	void reset();
	void setStart(int x);
}