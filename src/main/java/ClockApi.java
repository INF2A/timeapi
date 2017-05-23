package main.java;

/**
 * Created by basva on 2-5-2017.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
public class ClockApi {
    Time time = new Time();

    /**
     * return a string formatted to json, containing the current time of a given continent and place
     * @return return a string formatted to json, containing the current time (local)
     * @Path at path /time the method Time will be called.
     */

    @Path("/time")
    @GET
    @Produces("application/json")
    public String Time() {
        return time.getCurrentDate();
    }


    /**
     * return a string formatted to json, containing the current time of a given continent and place
     * @param continent continent of the requested time
     * @param place place of the requested time
     * @return return a string formatted to json, containing the current time of a given continent and place
     * @Path at path /time/{timezone}/{place} the method TimeWithTimeZones will be called.
     */
    @Path("/time/{timezone}/{place}")
    @GET
    @Produces("application/json")
    public String TimeWithTimeZones(@PathParam("timezone") String continent, @PathParam("place") String place) {
        return time.getCurrentDateWithTimeZone(continent,place);
    }
}