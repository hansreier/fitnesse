package car;

import places.Location;

public interface Car {
	boolean needsFuel();

	void addFuel(Double fuel);

	double getFuel();

	void emptyFuel();

	double getEngineTemperature();

	Location getDestination();

	Location getDeparture();

	void driveFrom(String destination);

	void driveTo(String destination);
}
