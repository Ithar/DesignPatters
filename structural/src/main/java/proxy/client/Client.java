package proxy.client;

import proxy.service.CentralServerProxy;
import proxy.service.Server;

public class Client {

    public static void main(String[] args) {

        String goodUrl = "www.safe.com";
        String badUrl = "www.danger.com";

        Server server = new CentralServerProxy();
        server.connect(goodUrl);

        try {
            server.connect(badUrl);
        } catch (RuntimeException e) {
            System.out.println("Site no safe: " + e.getMessage());
        }

    }
}
