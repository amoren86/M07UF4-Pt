package cat.institutmarianao.helloworld.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class HelloWorldClient {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient(); // Get a new Client from ClientBuilder
		WebTarget target = client.target("http://localhost:8080/helloworld/rest/hello"); // Prepare the target of the
																							// request
		Invocation invocation = target.request(MediaType.TEXT_HTML).buildGet(); // Build a request invocation from this
																				// target. The response type is HTML and
																				// method is GET
		Response res = invocation.invoke(); // Invoque the request
		System.out.println(res.readEntity(String.class)); // Read the returned entity as String
	}
}
