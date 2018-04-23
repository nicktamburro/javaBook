class ErrorMsg{
	//creating an array of Strings called msgs
	String msgs[] = {
		"Output Error", "Input Error", "Disk Full", "Index Out-Of-Bounds"
	};

	//return the message
	String getErrorMsg(int i){
		//if if it refers to the index of one of our error codes, return it...
		if(i >=0 & i < msgs.length)
			return msgs[i];
		else
			return "Invalid Error Code";
	}
}

//I'm thinking of this as return a Method, but they call it returning Objects, so think of it that way... 

class returnObject{
	public static void main(String args[]){
		ErrorMsg err = new ErrorMsg();

		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(19));

	}
}