package car;

import places.Location;

/**
 * @author no011033 The car class.
 *
 */
public class MyCar implements Car {
	public static final double FUELSIZE = 60;
	private Location departure, destination;
	private Double fuel = 0.0;

	public double getFuel() {
		return fuel;
	}

	public void addFuel(Double fuel) {
		this.fuel = Math.min(this.fuel + fuel, FUELSIZE);
	}

	public void emptyFuel() {
		fuel = 0.0;
	}

	public Location getDestination() {
		return destination;
	}

	public Location getDeparture() {
		return departure;
	}

	public void setDestination(Location destination) {
		this.destination = destination;
	}

	public boolean needsFuel() {
		return (fuel < 1.0);
	}

	public double getEngineTemperature() {
		return 1;
	}

	// Ctrl space is get alternatives in Eclipse
	public void driveTo(String destination) {

		this.destination = Location.get(destination);
	}

	// Ctrl space is get alternatives in Eclipse
	public void driveFrom(String departure) {
		this.departure = Location.get(departure);
	}

}
