package Package1;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONBuilder implements Builder {

	Element document;
	String bookToBuild;
	
	public JSONBuilder(String book) {
		
		this.bookToBuild = book;
	}
	
	public void build() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			HashMap<String, Object> map = mapper.readValue(new File(bookToBuild), HashMap.class);
			document = processMap(map);
		}catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
	}

	private Element processMap(HashMap<String, Object> map) {
		
		String className = map.get("class").toString();
		if (className.equals("Section")) {
			return buildSection(map);
		}
		
		if (className.equals("Paragraph")) {
			return buildParagraph(map);
		}
		
		if (className.equals("Image")) {
			return buildImage(map);
		}
		
		if (className.equals("ImageProxy")) {
			return buildImageProxy(map);
		}
		
		if (className.equals("Table")) {
			return buildTable(map);
		}
		return null;
	}

	@Override
	public Element getResult() {
		// TODO Auto-generated method stub
		return document;
	}

	@Override
	public Element buildSection(HashMap<String, Object> map) {
		
		Section section = new Section((String)map.get("title"));
		Collection<HashMap<String, Object>> children = (Collection)map.get("children");
		children.forEach((childMap) -> {
			Element e = this.processMap(childMap);
			if (e != null) {
				try {
					section.add(e);
				} catch (Exception var5) {
					var5.printStackTrace();
				}
			}
		});
		
		return section;
	}

	@Override
	public Element buildParagraph(HashMap<String, Object> map) {
		
		Paragraph paragraf = new Paragraph((String)map.get("text"));
		Collection<HashMap<String, Object>> children = (Collection)map.get("children");
		if (children != null)
		children.forEach((childMap) -> {
			Element e = this.processMap(childMap);
		});
		
		return paragraf;
	}

	@Override
	public Element buildImage(HashMap<String, Object> map) {
		
		Image image = new Image((String)map.get("url"));
		Collection<HashMap<String, Object>> children = (Collection)map.get("children");
		if (children != null)
		children.forEach((childMap) -> {
			Element e = this.processMap(childMap);
		});
		return image;
	}

	@Override
	public Element buildImageProxy(HashMap<String, Object> map) {
		
		ImageProxy imageProxy = new ImageProxy((String)map.get("url"));
		Collection<HashMap<String, Object>> children = (Collection)map.get("children");
		if (children != null)
		children.forEach((childMap) -> {
			Element e = this.processMap(childMap);
		});
		return imageProxy;
	}

	@Override
	public Element buildTable(HashMap<String, Object> map) {
		
		Table table = new Table((String)map.get("tableName"));
		Collection<HashMap<String, Object>> children = (Collection)map.get("children");
		if (children != null)
		children.forEach((childMap) -> {
			Element e = this.processMap(childMap);
		});
		return table;
	}
}
