package iterator.domain;

public class Channel {

    double frequency;
    String language;

    public Channel(double frequency, String language) {
        this.frequency = frequency;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", language='" + language + '\'' +
                '}';
    }
}
