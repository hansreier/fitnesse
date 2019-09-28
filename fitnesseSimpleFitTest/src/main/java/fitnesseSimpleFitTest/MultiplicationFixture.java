package fitnesseSimpleFitTest;

import fit.ColumnFixture;

public class MultiplicationFixture extends ColumnFixture
{
    public long operand1;
    public long operand2;

    public MultiplicationFixture()
    {
    }

    public long getOperand1()
    {
        return operand1;
    }

    public void setOperand1( long operand1 )
    {
        this.operand1 = operand1;
    }

    public long getOperand2()
    {
        return operand2;
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