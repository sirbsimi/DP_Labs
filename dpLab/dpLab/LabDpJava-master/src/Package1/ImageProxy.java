package Package1;

public class ImageProxy implements Element{
	
	private String imageName;
	private Image realImage;
	
	public ImageProxy(String imageName) {
		
		this.imageName = imageName;
	}
	
	@Override
	public void print() {
		if (realImage == null) {
			realImage = new Image(this.imageName);
		}
		realImage.print();
	}
	
    public void accept(Visitor visitor) {
    	
    	visitor.visit(this);
    }

	@Override
	public Element copy() {
		
		System.out.println("Copy ImageProxy");
		ImageProxy ip = new ImageProxy(this.imageName);
		return ip;
	}
}
