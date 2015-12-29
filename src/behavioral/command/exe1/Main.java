package behavioral.command.exe1;

public class Main {
	public static void main(String... args) {
		
		Light lamp = new Light(); // Receiver.
		Command turnOn = new TurningOnCommand(lamp); // Command.
		Command turnOff = new TurningOffCommand(lamp); // Command.
		
		Switch theSwitch = new Switch(); // Invoker.
		
		// set first command and execute.
		theSwitch.setCommand(turnOn);
		theSwitch.run();
		
		// set second command and execute.
		theSwitch.setCommand(turnOff);
		theSwitch.run();
	}
}
