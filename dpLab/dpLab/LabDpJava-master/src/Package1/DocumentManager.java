package Package1;

import java.util.Stack;

public class DocumentManager {

	private static DocumentManager instance = null;
	private Book book;
	private Stack<Command> commands;
	private DocumentManager() {
		
		this.commands = new Stack<Command>;
	}
	
	public Book getBook() {
		
		return this.book;
	}
	
	public void setBook(Book bookToSet) {
		
		this.book = bookToSet;
	}
	
	public void setBook(Section sectionToSet) {
		
		Book bookToSet = new Book("Titlu1");
		bookToSet.set_bookAuthor(new Author("Autor1"));
		bookToSet.set_content(sectionToSet.getContent());
		this.book = bookToSet;
	}
	
	public static DocumentManager getInstance() {
		
		if (instance == null) {
			instance = new DocumentManager();
		}
		
		return instance;
	}
}
