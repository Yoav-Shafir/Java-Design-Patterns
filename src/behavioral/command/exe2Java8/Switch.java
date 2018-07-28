package behavioral.command.exe2Java8;

// Invoker class.
// The Invoker is the class that actually puts the commands to work.
public class Switch {
	private Light light; // Receiver.
	private Command command; // Whatever command we pass in.

	public Switch(Light light) {
		this.light = light;
	}

	public Switch setCommand(Command command) {
		this.command = command;
		return this;
	}

	// Invoke the command passing the light ref.
	public void run() {
		command.apply(light);
	}
}
