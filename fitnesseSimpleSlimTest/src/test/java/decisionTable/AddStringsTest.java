package decisionTable;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddStringsTest {

    private AddStrings addStrings = new AddStrings();

    @BeforeAll
    public static void setup() {
        System.setProperty("java.util.logging.config.file",
                ClassLoader.getSystemResource("logging.properties").getPath());
    }

    @Test
    public void AddStringsTest() {
        addStrings.setInput1("Napoleons");
        addStrings.setInput2("hest");
        assertEquals( "Napoleons hest",addStrings.output(),"test sette sammen tekst");
    }
}

