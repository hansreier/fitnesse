package places;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import places.Location;

public class RoutesTest {
	RoutesData routes = new RoutesData();

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testDestinationOsloLillehammer() {
		assertEquals(140.0, routes.getDistance(Location.OSLO, Location.LILLEHAMMER), 0.0000001);
		assertEquals(140.0, routes.getDist(Location.OSLO, Location.LILLEHAMMER), 0.0000001);
	}

	@Test(expected = NullPointerException.class)
	public void testNoRoute() {
		assertEquals("OSLO_NOPLACE Route", 0, routes.getDist(Location.OSLO, Location.NOPLACE), 0.0000001);
	}

	@Test
	public void testNoRoute2() {
		assertNull("OSLO_NOPLACE Route", routes.getDistance(Location.OSLO, Location.NOPLACE));
	}
}
