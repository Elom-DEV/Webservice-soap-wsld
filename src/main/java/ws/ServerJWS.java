package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8080/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service deployed at :"+url);
    }
}
