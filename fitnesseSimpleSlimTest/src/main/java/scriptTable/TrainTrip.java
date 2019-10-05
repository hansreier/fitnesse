package scriptTable;

import decisionTable.AddStrings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrainTrip {

    private static final Logger log = LoggerFactory.getLogger(AddStrings.class);
    private String name;

    public TrainTrip(String name) {
        this.name = name;
        log.info("Starting traintrip");
    }

    public String startDestination() {
        log.info("Moelv");
        return "Moelv with "+name;
    }

    public String stop1() {
        log.info("Hamar");
        return "Hamar with "+name;
    }

    public String stop2() {
        log.info("Gardermoen");
        return "Gardermoen with "+name;
    }

    public String endDestination() {
        log.info("The end of trip");
        return "Oslo S with "+name;
    }
}
