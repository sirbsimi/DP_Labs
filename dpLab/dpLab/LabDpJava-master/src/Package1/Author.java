package Package1;

public class Author {

    private String _authorName;

    public Author(String AuthorName) {
        this._authorName = AuthorName;
    }

    public String get_authorName() {
    	if (this._authorName == null)
    		return "ASDF";
        return _authorName;
    }

    public void set_authorName(String _authorName) {
        this._authorName = _authorName;
    }
}
