package cat.institutmarianao.helloworld.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloWorldService {
	@GET
	@Produces("text/html")
	public String sayHello() {
		return "Hello World WS!!!";
	}
}