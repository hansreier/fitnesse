package fitnesseSlim;

import decisionTable.Multiplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

	@Test
	public void test() {
		Multiplication multiplication = new Multiplication();
		multiplication.setOperand1(5);
		multiplication.setOperand2(3);
		assertEquals(15, multiplication.product(),"Product");
	}
}
