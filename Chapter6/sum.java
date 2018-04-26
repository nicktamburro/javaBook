//create
//a varargs method called sum, that sums the int values passed to it, and returns the result

class Sum{
	int Sum(int ... i){



		int j;
		int sum = 0;

		for(j=0; j<i.length; j++){
			sum +=i[j];
		}
			return sum;
	}
}

class SumDemo{
	public static void main(String args[]){
		Sum sum1 = new Sum();

		int total = sum1.sum(1,2,3,4,5);
		System.out.println("Sum is " + total);

		total = sum1.sum(10,11,12,13);
		System.out.println("Sum is " + total);

	}
}