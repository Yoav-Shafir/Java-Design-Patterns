package behavioral.command.exe2Java8;

public class Main {
	public static void main(String... args) {

		Light lamp = new Light(); // Receiver.
		Switch theSwitch = new Switch(lamp); // Invoker.

		// Execute first command.
		theSwitch.setCommand((light) -> light.turnOn()).run();

		// Execute second command.
		theSwitch.setCommand((light) -> light.turnOff()).run();
	}
}
