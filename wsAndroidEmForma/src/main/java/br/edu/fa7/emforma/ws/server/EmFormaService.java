package br.edu.fa7.emforma.ws.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Web Service example
 * 
 * @author Marcelo Bezerra
 */
@WebService
public interface EmFormaService {
	@WebMethod
	String reverse(String value);

	@WebMethod
	Boolean login(String login, String senha);

}
