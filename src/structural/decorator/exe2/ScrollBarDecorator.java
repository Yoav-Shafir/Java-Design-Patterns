package structural.decorator.exe2;

public class ScrollBarDecorator extends Decorator implements GraphicalComponent {

	public ScrollBarDecorator(GraphicalComponent gc) {
		super(gc);
	}

	@Override
	public void paint() {
		System.out.println("Render the scroll bar...");
		super.paint();
	}

}
