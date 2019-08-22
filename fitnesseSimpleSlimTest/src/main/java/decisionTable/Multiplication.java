package decisionTable;

public class Multiplication {
	
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
        return operand1 * operand2;
    }
}
