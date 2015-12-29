package behavioral.command.exe1;

import java.util.ArrayList;
import java.util.List;

// invoker class.
// the invoker is the class that actually puts the commands to work. You typically 
// load a command object into the invoker and tell the invoker to run it.
// When you implement the Command design pattern, you don’t need to use
// an invoker if you don’t want to — if your commands only have an execute method.
public class Switch {
	private Command command;
	private List<Command> history = new ArrayList<Command>();
	
	public void setCommand(Command command) {
		this.command = command;
		this.history.add(command); // optional.
	}
	
	public void run() {
		command.execute();
	}
}
