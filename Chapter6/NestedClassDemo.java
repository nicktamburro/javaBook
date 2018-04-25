class Outer{
	int nums[];

//constructor
	Outer(int n[]){
	nums = n;
	}

//a method called analyze
	void analyze(){
	//creating a new instance of Inner called inOb (we haven't seen Inner yet)
		Inner inOb = new Inner();

		System.out.println("Minimum: " + inOb.min());
		System.out.println("Maximum: " + inOb.max());
		System.out.println("Average: " + inOb.avg());
	}

//here is the inner class
	class Inner {

	//a method called min that returns in int
		int min(){
			//a new int that, for now, equals the first number in the array;
			int m = nums[0];

			for(int i = 1 ; i < nums.length ; i++)
				if(nums[i] < m) m = nums[i];

			return m;
		}
//all this is the same except after the for loop
		int max(){
			int m = nums[0];

			for(int i = 1 ; i<nums.length; i++)
				if(nums[i] > m) m = nums[i];

			 return m;
		}

	//same again for avg
			int avg(){
				int a = 0;
				for (int i=0 ; i< nums.length; i++)
					a += nums[i];

				return a / nums.length;
			}
		}

	}



class NestedClassDemo{
	public static void main(String args[]){
		int x[] = {3,2,1,5,6,9,7,8};

		Outer outOb = new Outer(x);

		outOb.analyze();
	}
}