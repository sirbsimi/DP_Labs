package Package1;

import java.util.ArrayList;

public class DeleteCommand implements Command{
	
	private Memento memento;

	@Override
	public void execute() {
		
		
		DocumentManager manager = DocumentManager.getInstance();
		this.memento = new Memento();
		
		ArrayList<Element> elemente = manager.getBook().get_content();
		
		memento.setState(elemente);
		
		elemente.remove(elemente.size() - 1);
		manager.getBook().set_content(elemente);
	}
	
	public void unexecute() {
		
		DocumentManager manager = DocumentManager.getInstance();
		
		ArrayList<Element> elemente = memento.getState();
		
		manager.getBook().set_content(elemente);
	}
}
