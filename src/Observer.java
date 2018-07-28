import java.util.HashSet;
import java.util.Set;

class Notifier {
	private Set<IObserver> clients;

	Notifier() {
		this.clients = new HashSet<>();
	}

	void add(IObserver client) {
		this.clients.add(client);
	}

	void setValue(String s) {
		for (IObserver c : clients) {
			c.execute(s);
		}
	}
}

interface IObserver {
	public abstract void execute(String s);
}

class Client implements IObserver {

	@Override
	public void execute(String s) {
		System.out.println("From Client1: " + s);
	}
}

public class Observer {
	public static void main(String[] args) {
		Notifier n = new Notifier();
		IObserver client = new Client();
		n.add(client);
		n.setValue("Hello World");
	}
}
