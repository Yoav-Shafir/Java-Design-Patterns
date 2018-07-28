package behavioral.visitor.exe1;

// Each Car Element will have a reference
// to a CarElementVisitor implementation.
// Each item will invoke the 'visit()' method of the CarElementVisitor implementation
// and will pass itself (this) as an argument.
// that's why we need these 3 methods.
public interface CarElementVisitor {
	void visit(Wheel wheel);

	void visit(Engine engine);

	void visit(Body body);

	void visit(Car car);
}
