package decisionTable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddStrings {

	private static final Logger log = LoggerFactory.getLogger(AddStrings.class);

	private String input1;
	private String input2;

	public void setInput1(final String i1) {
		input1 = i1;
	}

	public void setInput2(final String i2) {
		input2 = i2;
	}

	public String output() {
		log.info("Arguments: {}, {} ", input1, input2);
		log.debug("This is a secret message");
		String result;
		result = input1 + " " + input2;
		log.info("Concatenated: {} ", result);
		return result;
	}
}
