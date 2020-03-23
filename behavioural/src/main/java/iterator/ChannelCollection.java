package iterator;

import iterator.domain.Channel;

public interface ChannelCollection {

    void addChannel(Channel channel);

    ChannelIterator iterator();
}
