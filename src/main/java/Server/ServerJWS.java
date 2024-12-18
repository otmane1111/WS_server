package Server;

import WS.BanqueServer;
import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8080/";
        Endpoint.publish(url, new BanqueServer());
        System.out.println("Web service deploye sur "+url);


    }
}