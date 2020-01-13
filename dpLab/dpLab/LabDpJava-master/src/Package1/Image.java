package Package1;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String _imageName;

    public String get_imageName() {
        return _imageName;
    }

    public void set_imageName(String _imageName) {
        this._imageName = _imageName;
    }

    public Image(String imageName){
        _imageName = imageName;
        
        try {
        	System.out.println("Sleep 5 seconds");
        	TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("Image name: "+get_imageName());
    }
    
    public void accept(Visitor visitor) {
    	
    	visitor.visit(this);
    }

	@Override
	public Element copy() {
		
		System.out.println("Copy Image");
		Image i = new Image(this.get_imageName());
		return i;
	}
}
