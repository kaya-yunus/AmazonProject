package api.stepDefs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class TestBaseApi {

    protected RequestSpecification spec;

    //@Before
    public void setUp(){
        spec=new RequestSpecBuilder().setBaseUri("https://api.trello.com").build();
    }
}
