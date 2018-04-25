//this program contains an error and will not compile

class VarArgs4{

	//SO TO FIX THIS, YOU WOULD MAKE ONE THAT TAKES NO ARGS
	/*static void vaTest(){
	
	}*/

	//use an int vararg
	static void vaTest(int ... v){

	}

	//use a boolean one
	static void vaTest(boolean ... v){

	}

	public static void  main(String args[]){
		vaTest(1, 2, 3);
		vaTest(true, false, false);
		//these are both okay!

		vaTest(); //error, ambiguous!
	}
}

