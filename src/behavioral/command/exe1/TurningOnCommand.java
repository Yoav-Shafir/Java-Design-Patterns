package behavioral.command.exe1;

// a concrete command to turn the light on.
public class TurningOnCommand implements Command {
	
	// ref to the receiver.
	private Light light;
	
	public TurningOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnOn();
	}
	
}
