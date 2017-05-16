package main.java;

/**
 * Created by basva on 2-5-2017.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;


@Path("/")
public class ClockApi {
    Time time = new Time();

    @Path("/time")
    @GET
    @Produces("application/json")
    public String Time() {
        return time.getCurrentDate();
    }

    /*

     */
    @Path("/time/{timezone}/{place}")
    @GET
    @Produces("application/json")
    public String News(@PathParam("timezone") String channel, @PathParam("place") String place) {
        if(!channel.isEmpty()) {
            return time.test(channel,place);
        }
        else  return time.test(channel,place);
    }
}