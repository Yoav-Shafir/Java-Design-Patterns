package behavioral.command.exe2Java8;

public class Main {
	public static void main(String... args) {
		
		Light lamp = new Light(); // Receiver.
		Switch theSwitch = new Switch(lamp); // Invoker.
		
		// execute first command.
		theSwitch.setCommand((light) -> light.turnOn());
		theSwitch.run();
		
		// execute second command.
		theSwitch.setCommand((light) -> light.turnOff());
		theSwitch.run();
	}
}
