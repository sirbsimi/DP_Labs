package Package1;

public class BookValue extends BookStatistics{

	int imageValue = 2;
	int paragraphValue = 3;
	int tableValue = 4;
	int sectionValue = 5;
	
	public void printValue() {
		
		int totalSectionValue = (this.sectionValue * this.sectionNumber);
		int totalImageValue = (this.imageValue * this.imageNumber);
		int totalTableValue = (this.tableValue * this.tableNumber);
		int totalParagraphValue = (this.paragraphValue * this.paragraphNumber);
		int totalValue = (this.imageValue * this.imageNumber) + (this.imageValue * this.imageNumber) + (this.paragraphValue * this.paragraphNumber) + (this.sectionValue * this.sectionNumber);
		System.out.println("Financial book\n Img value: " + totalImageValue + "\n Table value: " + totalTableValue + "\n Paragraph value: " + totalParagraphValue + "\n Section Value: " + totalSectionValue + "\n Total value" + totalValue);
	}
}
