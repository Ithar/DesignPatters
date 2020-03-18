package adapter;

import adapter.adaptors.SpeedAdaptor;
import adapter.adaptors.SpeedAdaptorImpl;
import adapter.adaptors.SpeedKilometerPerHour;
import adapter.adaptors.SpeedMilesPerHour;

public class Client {

    public static void main(String[] args) {

        SpeedAdaptor speedAdaptor = new SpeedAdaptorImpl();

        int mph = 70;
        double kmp = speedAdaptor.getSpeed(new SpeedMilesPerHour(70));
        System.out.println("MPH:" + mph + " KMP: " + kmp);

        int kmp2 = 112;
        double mph2 = speedAdaptor.getSpeed(new SpeedKilometerPerHour(kmp2));
        System.out.println("KMP: " + kmp2 + " MPH: " + mph2 );
    }
}
