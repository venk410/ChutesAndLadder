package book;
import javax.ws.rs.GET;
import javax.ws.rs.path;
import javax.ws.rs.produces;
import javax.ws.rs.core.MediaType;

//annotations

@path("/book")
public class Book {
	
	@GET
	@produces(MediaType.TEXT_XML)
	public String sayHelloXML() {
		
		String response = "?xml version= '1.0'?" + "<hello>Hello XML </hello>";
		
		return response;
	
	}
	/*@GET
	@produces(MediaType.APPLICATION_JSON)
	public String sayHelloJSON() {
		
		String response = null;
		
		return response;
}*/
