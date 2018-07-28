package structural.builder.lambda;

import java.util.function.Consumer;

class Mailer {
	private Mailer print(String val) {
		System.out.println(val);
		return this;
	}

	public Mailer from(String addr) {
		print("from");
		return this;
	}

	public Mailer to(String addr) {
		print("to");
		return this;
	}

	public Mailer subject(String subjectLine) {
		print("subject");
		return this;
	}

	public Mailer body(String message) {
		print("body");
		return this;
	}

	public static void send(Consumer<Mailer> block) {
		Mailer mailer = new Mailer();
		block.accept(mailer);
		System.out.println("sending...");
	}
}

public class Exe1 {
	public static void main(String[] args) {
		Mailer.send(mailer -> mailer.from("ajay@sample.com").to("sreeram@sample.com").subject("sample subject")
				.body("..."));
	}
}
