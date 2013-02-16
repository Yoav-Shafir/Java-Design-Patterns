package structural.decorator.exe2;

public class BorderDecorator extends Decorator {

	public BorderDecorator(GraphicalComponent gc) {
		super(gc);
	}

	@Override
	public void paint() {
		System.out.println("We can render the border before forwarding to the next item in the chain");
		super.paint();
		System.out.println("We can render the border after forwarding to the next item in the chain");
	}
	
}
