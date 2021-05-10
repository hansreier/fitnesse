package places;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author Reier Actually tests location enum as well
 *
 */
public class RouteTest {

	@BeforeEach
	public void setUp()  {
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
