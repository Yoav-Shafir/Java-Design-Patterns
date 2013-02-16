package behavioral.visitor.exe1;

public class Car implements VisitableCarElement {
	VisitableCarElement[] elements;
	
	public Car() {
		this.elements = new VisitableCarElement[] {
			new Wheel("front right"), new Wheel("back left"),
			new Wheel("back right"), new Body(), new Engine()
		};
	}
	
	@Override
	public void accept(CarElementVisitor visitor) {
		for (VisitableCarElement carElement : elements) {
			carElement.accept(visitor);
		}
		visitor.visit(this);
	}

}
