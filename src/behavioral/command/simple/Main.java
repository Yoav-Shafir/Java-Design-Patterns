package behavioral.command.simple;

// Receiver.
class Lamp {
	void turnOff() {
		System.out.println("Turnning off...");
	}

	void turnOn() {
		System.out.println("Turnning on...");
	}
}

// Command.
class Command {
	private Lamp lamp;

	public Command(Lamp lamp) {
		this.lamp = lamp;
	}

	void execute(int code) {
		if (code == 0)
			lamp.turnOff();
		else
			lamp.turnOn();
	}
}

// Invoker.
class Room {

	private Command command;

	void setCommand(Command command) {
		this.command = command;
	}

	void run(int code) {
		this.command.execute(code);
	}
}

public class Main {
	public static void main(String[] args) {
		// Create Receiver.
		Lamp lamp = new Lamp();

		// Create one simple command.
		Command command = new Command(lamp);

		// Create Invoker.
		Room room = new Room();

		// Add command and run with args.
		room.setCommand(command);
		room.run(0);
	}
}
