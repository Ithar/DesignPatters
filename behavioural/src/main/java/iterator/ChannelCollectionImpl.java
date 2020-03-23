package iterator;

import iterator.domain.Channel;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        channelsList.add(channel);
    }

    @Override
    public ChannelIterator iterator() {
        return new ChannelIteratorImpl();
    }

    private class ChannelIteratorImpl implements ChannelIterator {

        private List<Channel> channels;
        int position = 0;

        public ChannelIteratorImpl() {
            this.channels = channelsList;
        }

        @Override
        public boolean hasNext() {
            return position < 4;
        }

        @Override
        public Channel next() {
            Channel channel = channels.get(position);
            position++;
            return channel;
        }
    }
}
