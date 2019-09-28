package fitnesseSlim;

import static junit.framework.Assert.*;

import org.junit.Test;

import decisionTable.Multiplication;

public class MultiplicationTest {

	@Test
	public void test() {
		Multiplication multiplication = new Multiplication();
		multiplication.setOperand1(5);
		multiplication.setOperand2(3);
		assertEquals("Product", 15, multiplication.product());
	}
}
