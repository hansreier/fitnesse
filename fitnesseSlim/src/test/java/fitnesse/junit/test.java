package fitnesse.junit;

import org.junit.runner.RunWith;

import fitnesse.junit.FitNesseRunner.DebugMode;

@RunWith(FitNesseRunner.class)
@FitNesseRunner.Suite("ReiersTestSlimSuite")
@FitNesseRunner.FitnesseDir("src/main/resources")
@FitNesseRunner.OutputDir("target/fitnesse-results")
@DebugMode(true)
public class test {

}
