package id.kawahedukasi.controller;

import id.kawahedukasi.model.Factorial;
import io.vertx.core.json.JsonObject;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/factorial")
public class FactorialController {

    @GET
    @Transactional
    public int factorial(@QueryParam("bilangan") int bilangan){

        int factorial = 1;
        for (int i = 1; i <= bilangan; i++){
            factorial *= i;
        }

        Factorial fact = new Factorial();

        fact.setN(bilangan);
        fact.setFactorial(factorial);
        Factorial.persist(fact);
        return factorial;
    }
}
