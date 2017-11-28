package com.example.api.integration.tests.restassureddemo.integration.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(BlockJUnit4ClassRunner.class)
public class RestAssuredApiTest {

    @Test
    public void test() {
        when()
                .get("/respond.xml")
                .then()
                .body("responseModel.name", equalTo("Test"));
    }

}
