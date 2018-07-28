// The one that will be visited by the Visitor. 
interface Visitable {
	enum State {
		OK, ERROR
	}

	String getState();

	void accept(Visitor visitor);
}

// The Visitor will visit the Visitable.
interface Visitor {
	void visit(Visitable visitable);
}

// The Computer will be visited by the VirusScan Visitor.
// The virusScan will check its state.
class Computer implements Visitable {
	private State state;

	Computer() {
		this.state = State.OK;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getState() {
		return state.toString();
	}
}

// The VirusScan will be visiting the Computer and do what ever
// it needs to do.
class VirusScan implements Visitor {

	@Override
	public void visit(Visitable visitable) {
		System.out.println(visitable.getState());
	}
}

public class Test {
	public static void main(String[] args) {
		Computer computer = new Computer();
		VirusScan virusScan = new VirusScan();
		computer.accept(virusScan);
	}
}
