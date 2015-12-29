package behavioral.command.exe2Java8;

// invoker class.
// the invoker is the class that actually puts the commands to work.
public class Switch {
	private Light light; // Receiver.
	private Command command; // whatever command we pass in.
	
	public Switch(Light light) {
		this.light = light;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	// invoke the command passing the light ref.
	public void run() {
		command.apply(light);
	}
}
