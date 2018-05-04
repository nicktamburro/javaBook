package bookpackext;

class UseBook{
	public static void main(String args[]){
			////here we Qualify Book with its package name "bookpack"
		bookpack.Book books[] = new bookpack.Book[2];

		books[0] = new bookpack.Book("Cat's Cradle", "Vonnegut", 1976);
		books[1] = new bookpack.Book("I Really Like Slop", "Willems", 2013);
	}
}
//well, this is just one way, but coming up next is the Import, like node, so I think
//i'll like that more