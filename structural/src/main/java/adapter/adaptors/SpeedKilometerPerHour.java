package adapter.adaptors;

import lombok.Getter;

@Getter
public class SpeedKilometerPerHour {

    int speedKPH;

    public SpeedKilometerPerHour(int speedKPH) {
        this.speedKPH = speedKPH;
    }
}
