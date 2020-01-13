package Package1;

public class Paragraph implements Element {
    private String _paragraphName;
    private AlignStrategy alignStrategy;

    public void setAlignStrategy(AlignStrategy strategy) {
    	
    	this.alignStrategy = strategy;
    }
    
    public String get_paragraphName() {
        return _paragraphName;
    }

    public void set_paragraphName(String _paragraphName) {
        this._paragraphName = _paragraphName;
    }

    public Paragraph(String paragraphName){
    	if(paragraphName == null) {
    		paragraphName = "Paragraf Def";
    	}
        _paragraphName = paragraphName;
    }

    @Override
    public void print() {
    	String s = "Table name: "+get_paragraphName();
    	if(this.alignStrategy != null) {
	    	
	        this.alignStrategy.print(s);
    	}
    	else System.out.println(s);
    }
    
    public void accept(Visitor visitor) {
    	
    	visitor.visit(this);
    }

	@Override
	public Element copy() {
		
		System.out.println("Copy Paragraph");
		Paragraph p = new Paragraph(this._paragraphName);
		p.setAlignStrategy(this.alignStrategy);
		return p;
	}
}
