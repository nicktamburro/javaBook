class ScopeDemo{
	public static void main(String args[]){
		int x = 10;

		if (x == 10){
			int y = 20;

			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
			System.out.println("x in here equals " + x);
		}

		System.out.println("x out here equals " + x);
	}
}