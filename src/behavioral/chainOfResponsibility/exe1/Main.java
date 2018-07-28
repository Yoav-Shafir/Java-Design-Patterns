package behavioral.chainOfResponsibility.exe1;

public class Main {
	public static void main(String[] args) {

		final int FRONT_END_HELP = 1;
		final int INTERMEDIATE_LAYER_HELP = 2;
		final int GENERAL_HELP = 3;

		// These are all the Receivers components which make the chain.
		Application app = new Application(); // Implements the HelpInterface.
		IntermediateLayer intermediateLayer = new IntermediateLayer(app); // Implements the HelpInterface.
		FrontEnd frontEnd = new FrontEnd(intermediateLayer); // Implements the HelpInterface.

		// TODO: it would be better to hide all the HelpInterface components
		// behind a wrapper object/API.
		// Here we interact directly with the frontEnd object which is not good.
		frontEnd.getHelp(GENERAL_HELP);
	}
}
