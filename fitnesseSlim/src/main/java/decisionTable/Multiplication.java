package decisionTable;

import org.apache.log4j.Logger;

public class Multiplication {

	final static Logger LOG = Logger.getLogger(Multiplication.class);

	private long operand1;
	private long operand2;

	public void setOperand1(long operand1) {
		this.operand1 = operand1;
	}

	public void setOperand2(long operand2) {
		this.operand2 = operand2;
	}

	public long product() {
		long product;
		LOG.debug("Calculating product of " + operand1 + " * " + operand2);
		product = operand1 * operand2;
		LOG.debug("Result is: " + product);
		return product;

	}
}
