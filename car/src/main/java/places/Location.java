package places;

//Eclipse formatting turned off.
//@formatter:off
public enum Location {
	NOPLACE(""),
	OSLO("Oslo"), 
	LILLEHAMMER("Lillehammer"), 
	HAMAR("Hamar"), 
	GJOVIK("Gjøvik"), 
	MOELV("Moelv");

	Location(String name) {
		this.name = name;
	};

	private String name; // operator abbreviation/keyword
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static Location get(String name) {
		for (Location l : Location.values()) {
			if (l.getName().toLowerCase().equals(name.toLowerCase())) {
				return l;
			}
		}
		return NOPLACE;
	}
}
