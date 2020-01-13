package Package1;

public class OpenCommand implements Command{

	private String bookToBuild;
	
	public OpenCommand(String b) {
		this.bookToBuild = b;
	}
	
	@Override
	public void execute() {
		
		Builder jsonBuilder = new JSONBuilder("book.json");
		jsonBuilder.build();
		Element elementMyBook = jsonBuilder.getResult();
		Book book = new Book("My book");
		book.addContent(elementMyBook);
		book.set_bookAuthor(new Author("AUTOR1"));
		DocumentManager manager = DocumentManager.getInstance();
		manager.setBook(book);
	}

}
