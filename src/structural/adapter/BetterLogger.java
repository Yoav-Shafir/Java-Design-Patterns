package structural.adapter;

// some third party library that we want to use instead of 
// the current implementation.
public class BetterLogger {
	
	// the implementation here is deliberately ugly
	// and very different.
	// the adapter will take care doing the adjustment.
	public void log(String str, int type) {
		if (type == 0) {
			System.out.println("TRACE: " + str);
		} else if (type == 1) {
			System.out.println("DEBUG: " + str);
		} else if (type == 2) {
			System.out.println("LOG: " + str);
		}
	}
}
