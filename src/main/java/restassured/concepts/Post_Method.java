package restassured.concepts;

import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Post_Method {
	
	@Test
	public void test_method() {
		
		baseURI = "https://reqres.in/";
		given()
		.queryParam("", "")
		.auth().basic("", "")
		.header("","")
		.body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}")
	
		.when()
		.post("/api/users")
		
		.then()
		.log().all().assertThat().statusCode(201);
		
	}
	

}
