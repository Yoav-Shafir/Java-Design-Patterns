package structural.decorator.exe2;

public abstract class Decorator implements GraphicalComponent{
	
	private GraphicalComponent next;
	
	public Decorator(GraphicalComponent gc) {
		this.next = gc;
	}
	
	@Override
	public void paint() {
		this.next.paint();
	}

}
