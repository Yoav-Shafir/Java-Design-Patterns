package behavioral.visitor.exe1;

public class Engine implements VisitableCarElement {

	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}

}
