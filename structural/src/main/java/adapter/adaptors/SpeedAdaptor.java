package adapter.adaptors;

public interface SpeedAdaptor {

    double getSpeed(SpeedMilesPerHour speedMilesPerHour);

    double getSpeed(SpeedKilometerPerHour speedKilometerPerHour);
}
