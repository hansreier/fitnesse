package decisionTable;

import org.apache.log4j.Logger;

public class AddStrings {
	private String input1;
	private String input2;

	final static Logger LOG = Logger.getLogger(AddStrings.class);

	public void setInput1(final String i1) {
		input1 = i1;
	}

	public void setInput2(final String i2) {
		input2 = i2;
	}

	public String output() {
		String sum;
		LOG.debug("Calculating sum of " + input1 + " * " + input2);
		sum = input1 + " " + input2;
		LOG.debug("Sum is: " + sum);
		return sum;
	}
}
