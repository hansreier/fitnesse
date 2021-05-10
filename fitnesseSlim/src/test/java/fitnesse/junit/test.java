package fitnesse.junit;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;

import fitnesse.junit.FitNesseRunner.DebugMode;

//Must be run with a JUnit4 based runner @ExtendWith is the JUnit5 annotation
@RunWith(FitNesseRunner.class)
@FitNesseRunner.Suite("ReiersTestSlimSuite")
@FitNesseRunner.FitnesseDir("src/main/resources")
@FitNesseRunner.OutputDir("target/fitnesse-results")
@DebugMode(true)
public class test {

}
