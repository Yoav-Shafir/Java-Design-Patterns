package behavioral.chainOfResponsibility.exe1;

public class Application implements HelpInterface {

	@Override
	public void getHelp(int helpConstant) {
		System.out.println("This is the Application which is last in the chain.");
	}
}
