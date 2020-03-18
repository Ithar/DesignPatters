package adapter.adaptors;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpeedAdaptorImpl implements SpeedAdaptor {

    private static final double MPH_TO_KM = 1.609344;
    private static final double KM_TO_MPH = 0.621371;

    @Override
    public double getSpeed(SpeedMilesPerHour speedMilesPerHour) {
        int mph = speedMilesPerHour.getSpeedMilesPerHour();
        BigDecimal bd = new BigDecimal( mph * MPH_TO_KM).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public double getSpeed(SpeedKilometerPerHour speedKilometerPerHour) {
        int kmp = speedKilometerPerHour.getSpeedKPH();
        BigDecimal bd = new BigDecimal( kmp * KM_TO_MPH).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
