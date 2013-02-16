package behavioral.visitor.exe2;

// each Item(Liquor, Tabaco & Necessity) will have a reference
// to a visitor implementation.
// each item will invoke the 'visit()' method of the Visitor implementation
// and will pass it self (this) as an argument.
// that's why we need these 3 methods.
public interface Visitor {
	public double visit(Liquor liquorItem);
	public double visit(Tabaco tabacoItem);
	public double visit(Necessity necessitytem);
}
