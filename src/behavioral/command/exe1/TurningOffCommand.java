package behavioral.command.exe1;

// a concrete command to turn the light on.
public class TurningOffCommand implements Command {
	
	// ref to the receiver.
	private Light light;
	
	public TurningOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnOff();
	}
	
}
