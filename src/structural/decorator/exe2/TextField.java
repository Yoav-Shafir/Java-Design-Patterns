package structural.decorator.exe2;

import java.util.LinkedList;
import java.util.List;

public class TextField implements GraphicalComponent {
	
	private List<String> lines = new LinkedList<>();

	@Override
	public void paint() {
		System.out.println("Start TextField...");
		for (String l : this.lines) {
			System.out.println(l);
		}
		System.out.println("End	TextField...");
	}
	
	public TextField addContent(String line) {
		this.lines.add(line);
		return this;
	}

}
