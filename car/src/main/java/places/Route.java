package places;

public class Route {
	private String id;
	private Location from;
	private Location to;

	public Route(Location from, Location to) {
		super();
		this.from = from;
		this.to = to;
		this.id = from.getName() + '_' + to.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Location getTo() {
		return to;
	}

	public void setTo(Location to) {
		this.to = to;
	}

	public Location getFrom() {
		return from;
	}

	public void setFrom(Location from) {
		this.from = from;
	}
}
