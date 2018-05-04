//this used to have it's own package, which was making it weird...
//look into that.
import bookpack.*;

class UseBook{
	public static void main(String args[]){
			////here we Qualify Book with its package name "bookpack"
		bookpack.Book books[] = new Book[2];

		books[0] = new Book("Cat's Cradle", "Vonnegut", 1976);
		books[1] = new Book("I Really Like Slop", "Willems", 2013);

		for(int i=0; i<books.length; i++) books[i].show();
	}
}