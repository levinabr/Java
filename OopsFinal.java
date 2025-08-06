package javarogramming;
class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter = 1000;
	final static String Library_Name="Central Library";
	
	Book(){
		title = "no title";
		author = "no author";
		this.bookID = bookCounter++;
		
	}
	
	Book(String title ,String author){
		this.title = title;
		this.author = author;
		this.bookID = bookCounter++;
		
	}
	public void displayInfo() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(bookID);
		
	}
	public void displayInfo(boolean showLibrary) {
		if(showLibrary) {
			displayInfo();
			System.out.println("Library Name : "+ Library_Name);
		}
	}
	public static void displayTotalBooks() {
		System.out.println("total books" + (bookCounter-1000));
	}
	
}

public class OopsFinal {
	public static void main(String[]args) {
		Book book = new Book();
		book.displayInfo(true);
		book.displayTotalBooks();
	}
	

}
