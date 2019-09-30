package places;

import java.util.HashMap;
import java.util.Map;

public class Routes {
	private Map<String, Double> distances = new HashMap<String, Double>();

	public Map<String, Double> getDistances() {
		return distances;
	}

	public void setDistances(Map<String, Double> distances) {
		this.distances = distances;
	}

	public void addDistance(Location from, Location to, double distance) {
		distances.put(from.getName() + '_' + to.getName(), distance);
	}

	public double getDist(Location from, Location to) throws NullPointerException {
		System.out.println(from.getName() + '_' + to.getName());
		return distances.get(from.getName() + '_' + to.getName());
	}

	public Double getDistance(Location from, Location to) throws NullPointerException {
		System.out.println(from.getName() + '_' + to.getName());
		return distances.get(from.getName() + '_' + to.getName());
	}

	public double getDist(String from, String to) throws NullPointerException {
		return distances.get(from + '_' + to);
	}

	public Double getDistance(String from, String to) throws NullPointerException {
		return distances.get(from + '_' + to);
	}
}
