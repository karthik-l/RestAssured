package restassured.concepts;

import org.junit.Test;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class GetMethod {
	public static String url = "https://reqres.in";

	@Test
	public void get_Method() {
		Response response = get(url + "/api/users/2");
		System.out.println(response.asString());
		System.out.println(response.body().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		System.out.println(response.getSessionId());

	}

	@Test
	public void get_Method1() {
		// given -- pre condition
		// when -- submitting request
		// then -- validation
		given().get(url + "/api/users/2").then().statusCode(200).log().all();

	}

}
