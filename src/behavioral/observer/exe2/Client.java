package behavioral.observer.exe2;

public class Client implements Observer {

	@Override
	public void update(String operation, String record) {
		System.out.println("The client says a " + operation +
			" operation was performed on " + record);
	}

}
