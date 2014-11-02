package br.edu.fa7.emforma.ws.server;

import javax.jws.WebService;
@WebService(endpointInterface = "br.edu.fa7.emforma.ws.server.EmFormaService")
public class EmFormaServiceImpl implements EmFormaService {
    @Override
    public String reverse(String value) {
        if (value == null) return null;
        return new StringBuffer(value).reverse().toString();
    }

	@Override
	public Boolean login(String login, String senha) {
		// TODO Implementar Logica
		return true;
	}
}



