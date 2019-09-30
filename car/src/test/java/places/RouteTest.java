package places;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Reier Actually tests location enum as well
 *
 */
public class RouteTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLillehammerMoelv() {
		Route route = new Route(Location.LILLEHAMMER, Location.MOELV);
		assertEquals("Lillehammer_Moelv", route.getId());
	}

	@Test
	public void testLillehammerNoPlace() {
		Route route = new Route(Location.LILLEHAMMER, Location.NOPLACE);
		assertEquals("Lillehammer_", route.getId());
	}
}
