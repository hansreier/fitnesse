package fit;


import org.apache.log4j.Logger;

import fit.ColumnFixture;

public class MultiplicationFixture extends ColumnFixture {
	final static Logger LOG = Logger.getLogger(MultiplicationFixture.class);

	public long operand1;
	public long operand2;

	public MultiplicationFixture() {
	}

	public long getOperand1() {
		return operand1;
	}

	public void setOperand1(long operand1) {
		this.operand1 = operand1;
	}

	public long getOperand2() {
		return operand2;
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