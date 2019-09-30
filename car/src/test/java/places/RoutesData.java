package places;

public class RoutesData extends Routes {

	public void defineRoutes() {

	}

	public RoutesData() {
		super();
		addDistance(Location.OSLO, Location.GJOVIK, 115);
		addDistance(Location.OSLO, Location.HAMAR, 110);
		addDistance(Location.OSLO, Location.LILLEHAMMER, 140);
	}
}
