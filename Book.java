package unl.cse.library;

import java.time.LocalDate;
import java.time.Period;

/**
 * This class models an individual book.
 *
 */
public class Book {
	private String title;
	private String isbn;
	private Author author;
	private String publishDate;
	private int age;
	

	public Book(String title, Author author, String isbn, String publishDate) {
		this.title=title;
		this.isbn=isbn;
		this.author=author;
		this.publishDate=publishDate;
	}



	/**
	 * Getter method for author
	 * 
	 * @return
	 */
	public Author getAuthor() {
		return this.author;
	}

	/**
	 * Setter method for authors
	 * 
	 * @param author
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

	/**
	 * Getter method for call number.
	 * 
	 * @return
	 */
	public String getISBN() {
		return this.isbn;
	}

	/**
	 * Setter method for call number.
	 * 
	 * @param callNumber
	 */
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * Getter method for title
	 * 
	 * @return
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Setter method for title
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Getter method for the publish date
	 * 
	 * @return publishDate
	 */
	public String getPublishDate() {
		return this.publishDate.toString();
	}


	/**
	 * returns the age of the book
	 */
	public int getAge() {
		int age = Period.between(LocalDate.parse(publishDate), LocalDate.now()).getYears();
		return age;
	}



	public void setPublishDate(String publishDate) {
		this.publishDate= publishDate;
		
	}
	
}
