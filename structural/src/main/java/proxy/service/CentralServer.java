package proxy.service;

public class CentralServer implements Server {

    @Override
    public void connect(String url) {
        System.out.println("Connecting to :" + url);
    }
}
