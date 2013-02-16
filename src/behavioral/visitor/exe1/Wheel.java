package behavioral.visitor.exe1;

public class Wheel implements VisitableCarElement {
	private String name;
	
	public Wheel(String name) {
        this.name = name;
    }
	
	public String getName() {
        return this.name;
    }
	
	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}

}
