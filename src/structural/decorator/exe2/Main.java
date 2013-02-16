package structural.decorator.exe2;

public class Main {
	public static void main(String[] args) {
		GraphicalComponent textField = constructText();
		
		// start wrap the textField with decorators.
		textField = new BorderDecorator(textField);
		textField = new ScrollBarDecorator(textField);
		textField.paint();
	}
	
	public static GraphicalComponent constructText() {
		
		// create simple TextField instance.
		TextField textField = new TextField();
		textField.addContent("Hello")
			.addContent("World")
			.addContent("Ya")
			.addContent("all");
		
		// we return 'GraphicalComponent' because the decorator chain'
		// we are about to create is of type 'GraphicalComponent'. 
		return (GraphicalComponent) textField;
	}
}
