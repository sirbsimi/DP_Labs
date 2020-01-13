package Package1;

public class MainClass {

    public static void main(String[] args) {

    	Section cap1 = new Section("Capitolul 1");
    	cap1.add(new Paragraph("Moto capitol"));
    	cap1.add(new Paragraph("Another One"));
    	cap1.add(new Paragraph("Another Two"));
    	cap1.add(new Paragraph("Another Three"));
    	DocumentManager.getInstance().setBook(cap1);
    	System.out.println("Book Content: ");
    	DocumentManager.getInstance().getBook().print();

    	new DeleteCommand().execute();
    	System.out.println("Book Content after the first delete: ");
    	DocumentManager.getInstance().getBook().print();
    	new DeleteCommand().execute();
    	System.out.println("Book Content after the second delete: ");
    	DocumentManager.getInstance().getBook().print();
    }
}
