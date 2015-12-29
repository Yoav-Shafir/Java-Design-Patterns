package behavioral.command.exe2Java8;

@FunctionalInterface
public interface Command {
	public void apply(Light light);
}
