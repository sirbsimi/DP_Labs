package Package1;

import java.util.ArrayList;

public class Book {

    private String _title;
    private Author _bookAuthor;
    private ArrayList<Element> _content;

    public Book(String Title) {
        this._title = Title;
        _content = new ArrayList<Element>();
    }

    public void AddAuthor(Author author) {
        _bookAuthor = author;
    }

    public void addContent(Element element)
    {
        _content.add(element);
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public Author get_bookAuthor() {
    	if (_bookAuthor == null) {
    		return new Author("ASDF");
    	}
        return _bookAuthor;
    }

    public void set_bookAuthor(Author _bookAuthor) {
        this._bookAuthor = _bookAuthor;
    }

    public ArrayList<Element> get_content() {
        return _content;
    }

    public void set_content(ArrayList<Element> _content) {
        this._content = _content;
    }

    public void print()
    {

        System.out.println("Book Title: "+_title);
        System.out.println("Author: "+_bookAuthor.get_authorName());

        for (var element:_content)
        {
            element.print();
        }

    }


}
