package behavioral.chainOfResponsibility.exe1;

// The front end can only handle help requests about the front end, 
// for which we use the constant FRONT_END_HELP.
public class FrontEnd implements HelpInterface {
	
	final int FRONT_END_HELP = 1;
	HelpInterface successor;
	
	public FrontEnd(HelpInterface s) {
		successor = s;
	}
	
	@Override
	public void getHelp(int helpConstant) {
		if (helpConstant != FRONT_END_HELP) {
			successor.getHelp(helpConstant);
		} else {
			System.out.println("This is the front end handling the case.");
		}
	}

}
