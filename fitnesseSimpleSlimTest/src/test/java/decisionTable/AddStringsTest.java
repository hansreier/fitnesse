package decisionTable;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AddStringsTest {

    private AddStrings addStrings = new AddStrings();

    @BeforeClass
    public static void setup() {
        System.setProperty("java.util.logging.config.file",
                ClassLoader.getSystemResource("logging.properties").getPath());
    }

    @Test
    public void AddStringsTest() {
        addStrings.setInput1("Napoleons");
        addStrings.setInput2("hest");
        assertEquals("test", "Napoleons hest",addStrings.output());
    }
}

