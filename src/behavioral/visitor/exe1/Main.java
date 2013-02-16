package behavioral.visitor.exe1;

public class Main {
	public static void main(String[] args) {
		
		// create a car which also creates
		// its Visitable car child elements.
		VisitableCarElement car = new Car();
		
		// pass a Visitor implementation.
		car.accept(new CarElementPrintVisitor());
		
		// pass different Visitor implementation.
		car.accept(new CarElementDoVisitor());
	
		// this way we can add new operations/API to existing object structures 
		// without modifying those structures. 
		// It is one way to follow the open/closed principle.
	}
}
