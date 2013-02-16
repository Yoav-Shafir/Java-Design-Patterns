package structural.decorator.exe1;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPOutputStream;

// simple example of how decorator works in the java core library.
public class Main {
	public static void main(String[] args) {
		try {
			
			// no decorator - using simple 'FileOutputStream'.
			OutputStream os1 = new FileOutputStream("test.txt");
			writeSomeContentToOutputStream(os1);
			
			// with decorator - wrapping/decorating with 'GZIPOutputStream'. 
			OutputStream os2 = new FileOutputStream("test.zip");
			os2 = new GZIPOutputStream(os2);
			writeSomeContentToOutputStream(os2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeSomeContentToOutputStream(OutputStream os) throws IOException {
		String someContent = "This is osme content";
		
		// we can add even here another decorator to the chain.
		os = new BufferedOutputStream(os);
		
		os.write(someContent.getBytes(Charset.forName("UTF-8")));
	}
}
