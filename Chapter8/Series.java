public interface Series{
	//we're just delcaring methods that the classes will use,
	//kind of like abstract, they aren't defined...
	int getNext();
	void reset();
	void setStart(int x);
}