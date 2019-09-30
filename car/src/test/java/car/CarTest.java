package car;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import places.Location;

public class CarTest {

	private Car myFerrari = Mockito.mock(Car.class);
	private Car myAudi = new MyCar();

	@Before
	public void setUp() throws Exception {
		myAudi.emptyFuel();
	}

	// Mock
	@Test
	public void test() {
		assertFalse("new test double should return false as boolean", myFerrari.needsFuel());
		assertEquals("new test double should return 0.0 as double", 0.0, myFerrari.getEngineTemperature(), 0.0000001);

		when(myFerrari.needsFuel()).thenReturn(true);

		assertTrue("after instructed test double should return what we want", myFerrari.needsFuel());
	}

	// No mock
	@Test
	public void test2() {
		assertTrue("new test double should return false as boolean", myAudi.needsFuel());
		assertEquals("new test double should return 1.0 as double", 1.0, myAudi.getEngineTemperature(), 0.0000001);
	}

	@Test
	public void testDestinationOtta() {
		myAudi.driveTo("Otta");
		assertEquals(Location.NOPLACE, myAudi.getDestination());
	}

	@Test
	public void testDestinationOsloLillehammer() {
		myAudi.driveFrom("Oslo");
		myAudi.driveTo("Lillehammer");
		assertEquals(Location.OSLO, myAudi.getDeparture());
		assertEquals(Location.LILLEHAMMER, myAudi.getDestination());
	}

	@Test
	public void testAddFuel() {
		myAudi.addFuel(30.0);
		assertFalse(myAudi.needsFuel());
		assertEquals(30.0, myAudi.getFuel(), 0.000000001);
	}

	@Test
	public void testAddFuelToMuch() {
		myAudi.addFuel(80.0);
		assertEquals(MyCar.FUELSIZE, myAudi.getFuel(), 0.000000001);
	}

	@Test(expected = RuntimeException.class)
	public void throwException() {
		when(myFerrari.needsFuel()).thenThrow(new RuntimeException());
		myFerrari.needsFuel();
	}

	@Test
	public void testVerification() {
		myFerrari.driveTo("Sweet home Alabama");
		myFerrari.needsFuel();
		verify(myFerrari).driveTo("Sweet home Alabama");
		verify(myFerrari).needsFuel();
	}

}
