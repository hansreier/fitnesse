package decisionTable;

import static junit.framework.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MultiplicationTest {

    @BeforeClass
    public static void setup() {
        System.setProperty("java.util.logging.config.file",
                ClassLoader.getSystemResource("logging.properties").getPath());
    }

    @Test
    public void test() {
        Multiplication multiplication = new Multiplication();
        multiplication.setOperand1(5);
        multiplication.setOperand2(3);
        assertEquals("Product", 15, multiplication.product());
    }
}
