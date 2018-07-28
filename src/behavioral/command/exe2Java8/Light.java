package behavioral.command.exe2Java8;

// The Receiver class.
// The receiver is what a command object works on.
public class Light {

	public void turnOn() {
		System.out.println("The light is on");
	}

	public void turnOff() {
		System.out.println("The light is off");
	}
}
