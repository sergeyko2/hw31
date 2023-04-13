package hw31;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("")
public class HelloWorld {

    @GET
    public String index() {
        return "Hello, World!";
    }
}
