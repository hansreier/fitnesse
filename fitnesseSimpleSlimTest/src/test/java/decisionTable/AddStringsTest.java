package decisionTable;

import org.junit.Test;
import static org.junit.Assert.*;

public class AddStringsTest {

    private AddStrings addStrings = new AddStrings();

    @Test
    public void AddStringsTest() {
        addStrings.setInput1("Napoleons");
        addStrings.setInput2("hest");
        assertEquals("test", "Napoleons hest",addStrings.output());
    }
}

