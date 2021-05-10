package places;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoutesTest {
	RoutesData routes = new RoutesData();

	@BeforeEach
	public void setUp()  {
	}

	@Test
	public void testDestinationOsloLillehammer() {
		assertEquals(140.0, routes.getDistance(Location.OSLO, Location.LILLEHAMMER), 0.0000001);
		assertEquals(140.0, routes.getDist(Location.OSLO, Location.LILLEHAMMER), 0.0000001);
	}

	@Test
	public void testNoRoute() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			assertEquals( 0, routes.getDist(Location.OSLO, Location.NOPLACE), 0.0000001, "OSLO_NOPLACE Route");
		});
	}

	@Test
	public void testNoRoute2() {
		assertNull(routes.getDistance(Location.OSLO, Location.NOPLACE), "OSLO_NOPLACE Route");
	}
}
