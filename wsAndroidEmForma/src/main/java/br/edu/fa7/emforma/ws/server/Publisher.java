package br.edu.fa7.emforma.ws.server;

 import javax.xml.ws.Endpoint;
public class Publisher {
    public static void main(String[] args) {
    Endpoint.publish("http://localhost:8080/WS/EmFormaService",new EmFormaServiceImpl());
    }
}

