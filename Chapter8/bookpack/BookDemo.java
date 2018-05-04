package bookpack;
//so... this ffile is part of the bookpack package

//now we're adding public, so we can access from another package...
public class Book {
	private String title;
	private String author;
	private int pubDate;

		//adding public again...
	public Book(String t, String a, int d){
		title = t;
		author = a;
		pubDate = d;
	}
		//adding public again
	public void show(){
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}

class BookDemo {
	public static void main(String args[]){
		Book books[] = new Book[2];

		books[0] = new Book("Infinite Jest", "DFW", 1996);
		books[1] = new Book("Gravity's Rainbow", "Pynchon", 1978);

		for(int i=0; i < books.length; i++) books[i].show();
	}
}