package iterator.client;

import iterator.ChannelCollection;
import iterator.ChannelCollectionImpl;
import iterator.ChannelIterator;
import iterator.domain.Channel;

public class Client {

    public static void main(String[] args) {

        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, "ENGLISH"));
        channels.addChannel(new Channel(99.5, "GERMAN"));
        channels.addChannel(new Channel(100.5, "FRENCH"));
        channels.addChannel(new Channel(101.5, "ENGLISH"));

        ChannelIterator it = channels.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }

    }
}
