package proxy.service;

public class CentralServerProxy implements Server {

    private Server server = new CentralServer();

    @Override
    public void connect(String url) {

        if (url.contains("safe")) {
            server.connect(url);
            return;
        }

        throw new RuntimeException("Url " + url+ " is not permitted.");
    }
}