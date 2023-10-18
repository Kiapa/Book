package net.javacode;
import java.util.Scanner;

class Book{
	String title;
	String author;
	int numberOfPages;
}

public class BookInputTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Book book = new Book();
		System.out.println("Please enter the title of the book");
		book.title= in.nextLine();
		System.out.println("Please enter the author name");
		book.author = in.nextLine();
		System.out.println("Please enter the number of pages");
		book.numberOfPages = in.nextInt();
		
		System.out.println("The book title is: " +book.title);
		System.out.println("The author is: " +book.author);
		System.out.println("The book has " +book.numberOfPages);
		

	}

}