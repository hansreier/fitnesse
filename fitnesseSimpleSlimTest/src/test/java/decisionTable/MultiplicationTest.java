package decisionTable;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @BeforeAll
    public static void setup() {
        System.setProperty("java.util.logging.config.file",
                ClassLoader.getSystemResource("logging.properties").getPath());
    }

    @Test
    public void test() {
        Multiplication multiplication = new Multiplication();
        multiplication.setOperand1(5);
        multiplication.setOperand2(3);
        assertEquals(15, multiplication.product(),"Product");
    }
}
