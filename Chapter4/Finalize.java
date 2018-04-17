//ERROR MESSAGE: finalize .java uses or overrides a deprecated API...

//ohhh it seems that finalize() itself is no longer a thing

class FDemo{
	int x;

	//constructor that gives x a dynamic value;
	FDemo(int i){
		x = i;
	}

protected void finalize(){
	System.out.println("Finalizing " + x);
}

void generator (int i){
FDemo o = new FDemo(i);
}
}

class Finalize{
	public static void main(String args[]){
		int count;

		FDemo ob = new FDemo(0);

		for (count=1; count<1000 ; count++){
			ob.generator(count);
		}
	}
}