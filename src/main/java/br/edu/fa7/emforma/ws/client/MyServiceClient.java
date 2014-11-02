package br.edu.fa7.emforma.ws.client;



import br.edu.fa7.emforma.ws.server.EmFormaService;
import br.edu.fa7.emforma.ws.server.EmFormaServiceImplService;

public class MyServiceClient {
    public static void main(String[] args){
    EmFormaServiceImplService serviceImpl = new EmFormaServiceImplService();
    EmFormaService service = serviceImpl.getEmFormaServiceImplPort(); 
    System.out.println(service.reverse("123456789"));
    System.out.println(service.login("Teste", "Hello")+"Teste1");

    }
}

