package Package1;

import java.util.ArrayList;

public class Memento {

	private ArrayList<Element> state;
	
	public Memento() {
		this.state = new ArrayList<Element>();
	}
	
	public void setState(ArrayList<Element> stateToSet) {
		
		for (Element e: stateToSet) {
			state.add(e.copy());
		}
	}
	
	public ArrayList<Element> getState() {
		return this.state;
	}
}
