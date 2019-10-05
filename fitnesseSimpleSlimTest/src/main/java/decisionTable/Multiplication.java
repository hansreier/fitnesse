package decisionTable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Multiplication {

    private static final Logger log = LoggerFactory.getLogger(AddStrings.class);
	
	private long operand1;
    private long operand2;

    public void setOperand1( long operand1 )
    {
        this.operand1 = operand1;
    }

    public void setOperand2( long operand2 )
    {
        this.operand2 = operand2;
    }
    
    public long product()
    {
        long result;
        log.info("Operands: {} , {} ", operand1, operand2);
        result = operand1 * operand2;
        log.info("Product is: {} ", result);
        return operand1 * operand2;
    }
}
