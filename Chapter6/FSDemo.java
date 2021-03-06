class FailSoftArray{
	private int a[];
	private int errval; //value if get() is false
	public int length;

	//construct array given its size and the value to return if get() fails...
	public FailSoftArray(int size, int errv){
		a = new int[size];
		errval = errv;
		length = size;
	}

	//return value at a given index
	public int get(int index){
		if(indexOK(index)) return a[index];
		return errval;
	}

	//put a value at an index, return false on failure...
	public boolean put(int index, int val){
		if(indexOK(index)){
			a[index] = val;
			return true;
		}
		return false;
	}

	//return true if index is within bounds
	private boolean indexOK(int index){
		if (index >= 0 & index < length) return true;
		return false;
	}
}

//here it gets called
class FSDemo{
	public static void main(String args[]){
		FailSoftArray fs = new FailSoftArray(5, -1);
		int x;

		//show quiet failures
		System.out.println("Fail quietly");
		for(int i=0;i<(fs.length * 2); i++)
			fs.put(i, i*10);

		for(int i=0; i<(fs.length *2) ; i++){
			x = fs.get(i);
			if(x != -1) System.out.print(x + " ");
		}
		System.out.println("");

		//now, handle failures
		System.out.println("\nFail with error reports.");
		for(int i=0; i < (fs.length * 2); i++)
			if(!fs.put(i, i*10))
				System.out.println("Index " + i + " is out of bounds.");

			for (int i=0; i < (fs.length * 2) ; i++){
				x = fs.get(i);
				if(x != -1) System.out.print(x + " ");
				else
					System.out.println("Index " + i + " is out of control.");
			}
		
	}
}