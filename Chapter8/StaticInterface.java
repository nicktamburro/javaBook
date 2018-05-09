public interface MyIF{
	//"normal" interface method, not default
	int getUserID();

	//default method
	default int getAdminID(){
		return 1;
	}

	//static interface method.... but why?
	//so that no implementation is neccesary, you can just call it... see below
	static int getUniversalID(){
		return 0;
	}
}

//here you can just call that static method:
int uID = MyIF.getUniversalID();