package Package1;

public class BookStatistics implements Visitor{

	int imageNumber = 0; 
	int paragraphNumber = 0;
	int tableNumber = 0;
	int sectionNumber = 0;
	
	public void visit(Image image) {
		
		this.imageNumber += 1;
	}
	
	public void visit(ImageProxy imageProxy) {
		
		this.imageNumber += 1;
	}
	
	public void visit(Paragraph paragraph) {
		
		this.paragraphNumber += 1;
	}
	
	public void visit(Table table) {
		
		this.tableNumber += 1;
	}
	
	public void visit(Section section) {
		
		this.sectionNumber += 1;
	}
	
	public void printStatistics() {
		
		System.out.println("Book Statistics\n No. images: " + this.imageNumber + "\n No. tables: " + this.tableNumber + "\n No. paragraphs: " + this.paragraphNumber + "\n No. Sections: " + this.sectionNumber);
	}
}
