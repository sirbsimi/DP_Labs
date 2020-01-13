package Package1;

import java.util.ArrayList;

public class StatisticsCommand implements Command{

	@Override
	public void execute() {
		
		DocumentManager manager = DocumentManager.getInstance();
		
		BookStatistics stats = new BookStatistics();
		ArrayList<Element> content = manager.getBook().get_content();
		
		int i ;
		for (i = 0; i < content.size(); i++) {
			
			
			content.get(i).accept(stats);
			
		}
		stats.printStatistics();
	}
}
